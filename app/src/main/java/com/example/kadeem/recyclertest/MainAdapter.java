package com.example.kadeem.recyclertest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Callback;

import java.util.ArrayList;

/**
 * Created by Kadeem on 10/6/2017.
 */

class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private ArrayList<Dataclass> mDataset;
    private String[] urlList;
    private Context mContext;

    public MainAdapter(String[] urlList) {
        this.urlList = urlList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row, parent, false);

        mContext = v.getContext();

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ////Load image with picasso and set image to GONE when it has finished loading


        Picasso.with(mContext)
                .load(NetworkUtils.createURI(urlList[0]))   //Not working as yet
                .placeholder(R.drawable.bkp)
                .into(holder.mImage);
    }

    @Override
    public int getItemCount() {
        return urlList.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImage; //Change to imageview

        public ViewHolder(View itemView) {
            super(itemView);
            mImage = (ImageView) itemView.findViewById(R.id.imgListItem);  //Link to image view and cast to image view
        }
    }
}
