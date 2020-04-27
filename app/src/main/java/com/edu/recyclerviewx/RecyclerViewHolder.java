package com.edu.recyclerviewx;

//import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Sathya on 1/26/2019.
 */

// This will be the recycler view . which gets created only once..
// 6.46mb..

public class RecyclerViewHolder extends RecyclerView.ViewHolder { // 1

    TextView tv1,tv2;
    ImageView imageView;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
//                       11cf
        tv1= (TextView) itemView.findViewById(R.id.list_title);
        tv2= (TextView) itemView.findViewById(R.id.list_desc);
        imageView  = (ImageView) itemView.findViewById(R.id.list_avatar);

    }
}
