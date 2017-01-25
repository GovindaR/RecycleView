package com.example.user.customer1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {
    private List<Items> ItemsList = new ArrayList<>();
    private RecyclerView recyclerView;
    private Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new Adapter(ItemsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {
        Items item = new Items(R.drawable.Momo, "CHIKENMOMO", "250");
        ItemsList.add(item);

        Items item1 = new Items(R.drawable.Chaumin, "CHUMIEN", "200");
        ItemsList.add(item1);

        Items item2 = new Items(R.drawable.FireRice, "FIRERICE", "250");
        ItemsList.add(item2);


        Items item3 = new Items(R.drawable.ChikenRoast, "CHIKENROAST", "300");
        ItemsList.add(item3);

        Items item4 = new Items(R.drawable.Momo, "BUFFMOMO", "100");
        ItemsList.add(item4);

        Items item5 = new Items(R.drawable.Sizzler, "SIZZLER", "300");
        ItemsList.add(item5);


        mAdapter.notifyDataSetChanged();
    }
}
