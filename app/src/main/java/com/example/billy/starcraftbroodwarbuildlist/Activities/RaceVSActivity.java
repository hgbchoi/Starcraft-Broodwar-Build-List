package com.example.billy.starcraftbroodwarbuildlist.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.billy.starcraftbroodwarbuildlist.R;
import com.example.billy.starcraftbroodwarbuildlist.Adapter.RecyclerAdapter;

import java.util.ArrayList;

public class RaceVSActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerAdapter mRecyclerAdapter;
    ArrayList<String> myVSList;


    @Override
    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        super.setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(getString(R.string.OpponentRaceSelection));
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
        setContentView(R.layout.activity_race_vs);
        findViews();
        Intent i = getIntent();
        Toolbar toolbar = (Toolbar) findViewById(R.id.opponentracetoolbar);
        setSupportActionBar(toolbar);

        myVSList = i.getStringArrayListExtra("VS");
        mRecyclerView =  (RecyclerView) findViewById(R.id.possibleVSRecycler);
        mRecyclerAdapter =new RecyclerAdapter(this.getApplicationContext(), myVSList, mRecyclerView, "OpponentRaceSelection");
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, 1);
        mRecyclerView.addItemDecoration(dividerItemDecoration);
        mRecyclerView.setAdapter(mRecyclerAdapter);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
    }

    public void findViews(){

        mRecyclerView = (RecyclerView) findViewById(R.id.possibleVSRecycler);

    }



}
