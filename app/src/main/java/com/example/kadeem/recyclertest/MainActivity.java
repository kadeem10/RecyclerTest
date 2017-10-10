package com.example.kadeem.recyclertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Dataclass> mDataset;

    private String[] imgUrlList = {
            "http://freebiesland.my/wp-content/uploads/2015/01/Burger-King-e1422629416581.jpg",
            "http://www.mudah.org/wp-content/uploads/2013/06/burger-king-syiok-bbq-burger-promotion.jpg",
            "http://www.mudah.org/wp-content/uploads/2013/06/burger-king-syiok-bbq-burger-promotion.jpg",
            "http://www.mudah.org/wp-content/uploads/2013/06/burger-king-syiok-bbq-burger-promotion.jpg",
            "http://www.mudah.org/wp-content/uploads/2013/06/burger-king-syiok-bbq-burger-promotion.jpg"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mDataset = new ArrayList<>();
        for (int i = 0; i < 15; i++) {    //This loop may be the determining factor in making the number of views in the future. Maybe helping to make a certain number of views based on a getNumberOfItems pulled from server
            mDataset.add(new Dataclass("http://freebiesland.my/wp-content/uploads/2015/01/Burger-King-e1422629416581.jpg"));
        }


        //Obtain  link to recycler layout object
        mRecyclerView = (RecyclerView) findViewById(R.id.RecyclerView);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);


        //Specify Adapter and pass dataset
        mAdapter = new MainAdapter(mDataset);
        mRecyclerView.setAdapter(mAdapter);








    }
}
