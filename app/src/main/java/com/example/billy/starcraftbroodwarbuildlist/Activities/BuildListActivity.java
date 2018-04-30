package com.example.billy.starcraftbroodwarbuildlist.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.billy.starcraftbroodwarbuildlist.Adapter.RecyclerAdapter;
import com.example.billy.starcraftbroodwarbuildlist.Database.myDBmanager;
import com.example.billy.starcraftbroodwarbuildlist.Models.Builds;
import com.example.billy.starcraftbroodwarbuildlist.R;

import java.util.List;


public class BuildListActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerAdapter mRecyclerAdapter;
    myDBmanager mySQLiteDb;
    List<Builds> myBuildList;


    @Override
    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        super.setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(getString(R.string.BuildListToolbarTitle));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_build_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.buildListToolBar);
        setSupportActionBar(toolbar);
        mySQLiteDb = new myDBmanager(this);
        mRecyclerView = (RecyclerView) findViewById(R.id.build_list_Recycler);
        Intent j =  getIntent();
        if (j.getStringExtra("RaceVsChosen").equals("FavoriteBuilds")){

            myBuildList = mySQLiteDb.getBuildsByFavorite();
            if (myBuildList.size() == 0){
                setContentView(R.layout.activity_build_info_emptylist);
                Toolbar toolbar2 = (Toolbar) findViewById(R.id.buildListToolBar_2);
                setSupportActionBar(toolbar2);
            }

        }else {
            myBuildList = mySQLiteDb.getBuildsByRace(j.getStringExtra("RaceVsChosen"));
            if (myBuildList.size() == 0){
                setContentView(R.layout.activity_build_info_emptylist);
                Toolbar toolbar2 = (Toolbar) findViewById(R.id.buildListToolBar_2);
                setSupportActionBar(toolbar2);
            }
        }

        mRecyclerAdapter = new RecyclerAdapter(this, mRecyclerView, "BuildList", myBuildList);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mRecyclerAdapter);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, 1);
        mRecyclerView.addItemDecoration(dividerItemDecoration);
    }

}
