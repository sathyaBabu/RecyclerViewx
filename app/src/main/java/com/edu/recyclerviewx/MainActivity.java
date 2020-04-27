package com.edu.recyclerviewx;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;

/**
 *
 * Created by Sathya on 1/26/2019.
 */

// follow google.com/design
// for A- Z Dictact of material design - Sathya

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;



//    String [] name={"amarylis","anemone","aster","azalea",
//            "beebalm","birdofparadise","bluebell","buttercup","cherryblssom","chrysanthemum"};
//
//
//
//
//    int[] img =  new int[]{R.drawable.amaryllis, R.drawable.anemone, R.drawable.aster, R.drawable.azalea, R.drawable.beebalm,
//            R.drawable.birdofparadise, R.drawable.bluebell, R.drawable.buttercup, R.drawable.cherryblossom,
//            R.drawable.chrysanthemum, R.drawable.crocus};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

       // getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.LTGRAY));


        RecyclerAdapter adapter=new RecyclerAdapter(this);


        recyclerView.setAdapter(adapter);


       // recyclerView.setHasFixedSize(true);



      recyclerView.setLayoutManager(new LinearLayoutManager(this));


  //  recyclerView.setLayoutManager(new GridLayoutManager(this, 2, LinearLayoutManager.VERTICAL, false));

      //  recyclerView.setLayoutManager( new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
    }


}

