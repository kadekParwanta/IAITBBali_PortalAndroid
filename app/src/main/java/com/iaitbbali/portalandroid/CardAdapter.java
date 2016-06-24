package com.iaitbbali.portalandroid;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.iaitbbali.portalandroid.model.JSONAPI.Post;
import com.iaitbbali.portalandroid.model.Links;
import com.iaitbbali.portalandroid.model.WpFeaturedmedium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kadek_P on 6/24/2016.
 */
public class CardAdapter extends  RecyclerView.Adapter<CardAdapter
        .PostViewHolder>{

    private final ArrayList<Post> mDataset;

    public static class PostViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView displayName, dateTime, label, content;
        ImageView avatar, image;

        public PostViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            displayName = (TextView)itemView.findViewById(R.id.displayName);
            dateTime = (TextView)itemView.findViewById(R.id.dateTime);
            label = (TextView)itemView.findViewById(R.id.label);
            content = (TextView)itemView.findViewById(R.id.content);
            avatar = (ImageView)itemView.findViewById(R.id.avatar);
            image = (ImageView)itemView.findViewById(R.id.image);
        }
    }

    public CardAdapter(ArrayList<Post> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardviewpost, parent, false);

        PostViewHolder dataObjectHolder = new PostViewHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        holder.label.setText(mDataset.get(position).getTitle());
        holder.content.setText(mDataset.get(position).getExcerpt());
        holder.displayName.setText(mDataset.get(position).getAuthor().getSlug());
        holder.dateTime.setText(mDataset.get(position).getDate());

        if (holder.image != null) {
            Object links = mDataset.get(position).getAttachments();
            if (links == null) {
                return;
            }
            //TODO Handle image attachment

        }
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
