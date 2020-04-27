package com.edu.recyclerviewx;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
//import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Sathya on 1/26/2019.
 */
public class RecyclerAdapter extends  RecyclerView.Adapter<  RecyclerViewHolder  > {  // 2 view holder 1
    // Takes all the responsp.. of the recycler...

// /Users/malsneha/Library/Android/sdk

    String[] name={"amarylis","anemone","aster","azalea",
            "beebalm","birdofparadise","bluebell","buttercup","cherryblssom","chrysanthemum"};

    int[] img =  new int[]{R.drawable.amaryllis, R.drawable.anemone, R.drawable.aster, R.drawable.azalea, R.drawable.beebalm,
                           R.drawable.birdofparadise, R.drawable.bluebell, R.drawable.buttercup, R.drawable.cherryblossom,
                           R.drawable.chrysanthemum, R.drawable.crocus};


    String[] phone = new String[]{"1111","2222","3333","4444","5555","6666","7777","8888","9999","1212","4567"};

    Context context;
   // MainActivity mainActivity ;

    LayoutInflater inflater;  // 1.a

    public RecyclerAdapter(Context context) { // 3

        this.context=context;
        inflater= LayoutInflater.from(context);  //1.a
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // get the item_list root here...

      //inflate our R.layout.item_list
      // after inflating view in turn will hold the address of item_list.xml from resource..
        View view = inflater.inflate(R.layout.item_list, parent, false);  // 11cf


//        if( view == null )
//        {
//
//            // logic..   ListAdapter...
//        }


        /// we had if( view == null ) ardund the top line!!!! - That is what we called it as a recycler...
        // as an ObjectPool and MORE.....


        // Lets pass view to our object - to gain the characterstic of reycler!!!

        RecyclerViewHolder viewHolder = new RecyclerViewHolder( view );   // 1.b PASS the Root View to class RecycleViewHolder once to inflate




        // Guys Note : Dynamic data is not permited here by material design REF DOC :

        // https://material.google.com/patterns/swipe-to-refresh.html#swipe-to-refresh-usage
        //Don't.
       // Navigation drawers (if present in an app) contain navigation destinations, not dynamic content.



        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {


        // Binding happens here...

      //  holder.imageView.    ---> Check on this
        holder.tv1.setText(name[position]);                        // 4




        holder.imageView.setTag(holder);
        holder.imageView.setImageResource(img[position]);

        holder.imageView.setOnClickListener(clickListener);
        holder.tv1.setTag(holder);
        holder.tv1.setOnClickListener(clickListener);




    }

    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();
            int position = vholder.getPosition();

            Toast.makeText(context,"This is position "+name[position], Toast.LENGTH_LONG ).show();

//            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phone[position]) );
//            context.startActivity(intent);


        }
    };



    @Override
    public int getItemCount() {
        return name.length;
    }
}
