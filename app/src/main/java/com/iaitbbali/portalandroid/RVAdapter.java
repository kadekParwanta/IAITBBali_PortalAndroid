package com.iaitbbali.portalandroid;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.iaitbbali.portalandroid.model.Links;
import com.iaitbbali.portalandroid.model.Post;
import com.iaitbbali.portalandroid.model.WpFeaturedmedium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kadek_P on 5/12/2016.
 */
public class RVAdapter extends  RecyclerView
        .Adapter<RVAdapter
        .DataObjectHolder> {

    private static String LOG_TAG = "MyRecyclerViewAdapter";
    private ArrayList<Post> mDataset;
    private static RVClickListener myClickListener;

    public static class DataObjectHolder extends RecyclerView.ViewHolder
            implements View
            .OnClickListener {
        TextView label;
        TextView dateTime;
        WebView post;
        ImageView imageView;

        public DataObjectHolder(View itemView) {
            super(itemView);
            label = (TextView) itemView.findViewById(R.id.textView);
            dateTime = (TextView) itemView.findViewById(R.id.textView2);
            post = (WebView) itemView.findViewById(R.id.webView);
            imageView = (ImageView) itemView.findViewById(R.id.thumbImage);
            imageView.setOnClickListener(this);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (v == imageView) {
                myClickListener.onThumbnailClick(getAdapterPosition(), v);
            } else if (v == itemView) {
                myClickListener.onCardItemClick(getAdapterPosition(), v);
            }

        }
    }



    public RVAdapter(ArrayList<Post> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public DataObjectHolder onCreateViewHolder(ViewGroup parent,
                                               int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview, parent, false);

        DataObjectHolder dataObjectHolder = new DataObjectHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(DataObjectHolder holder, int position) {
        holder.label.setText(mDataset.get(position).getTitle().getRendered());
        holder.post.loadData(mDataset.get(position).getContent().getRendered(), "text/html", "UTF-8");

        String date = mDataset.get(position).getDate();
        String[] separated = date.split("T");
        String dateString = separated[0];
        String time = separated[1];
        holder.dateTime.setText(dateString + " , " + time);

        if (holder.imageView != null) {
            Links links = mDataset.get(position).getLinks();
            if (links == null) {
                return;
            }
            List<WpFeaturedmedium> wpFeaturedmediums = links.getWpFeaturedmedia();
            if (wpFeaturedmediums.size() > 0) {
                WpFeaturedmedium media = wpFeaturedmediums.get(0);
                String href = media.getHref();
                String htmlText = mDataset.get(position).getContent().getRendered();
                if (htmlText.isEmpty()) {
                    holder.imageView.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
                }
                new WpMediaDownloaderTask(holder.imageView).execute(href);
            }

        }
    }

    public void addItem(Post dataObj, int index) {
        mDataset.add(index, dataObj);
        notifyItemInserted(index);
    }

    public void deleteItem(int index) {
        mDataset.remove(index);
        notifyItemRemoved(index);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public interface RVClickListener {
        public void onCardItemClick(int position, View v);
        public void onThumbnailClick(int position, View v);
    }

    public void setOnItemClickListener(RVClickListener myClickListener) {
        this.myClickListener = myClickListener;
    }

}