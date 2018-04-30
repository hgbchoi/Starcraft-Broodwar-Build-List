package com.example.billy.starcraftbroodwarbuildlist.Activities;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import com.example.billy.starcraftbroodwarbuildlist.Adapter.RecyclerAdapter;
import com.example.billy.starcraftbroodwarbuildlist.Database.BuildData;
import com.example.billy.starcraftbroodwarbuildlist.Database.myDBmanager;
import com.example.billy.starcraftbroodwarbuildlist.Models.Builds;
import com.example.billy.starcraftbroodwarbuildlist.Models.MainCategory;
import com.example.billy.starcraftbroodwarbuildlist.R;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<MainCategory> mList = new ArrayList<>();
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerAdapter mRecyclerAdapter;
    myDBmanager mySQLiteDb;
    List<Builds> myBuildList;

    @Override
    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        super.setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(getString(R.string.MainActivityTitle));
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
        setContentView(R.layout.activity_main);
        populateRaceList();
        findViews();
        Toolbar toolbar = (Toolbar) findViewById(R.id.maintoolbar);
        setSupportActionBar(toolbar);
        mySQLiteDb = new myDBmanager(this);
        BuildData myBuild = new BuildData(getApplicationContext());
        if (mySQLiteDb.getAllBuilds().size() < myBuild.getBuildsAndputToList().size()) {
            addBuildsToDB();
        }
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerAdapter = new RecyclerAdapter(this, mList, mRecyclerView, "RaceList");
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, 1);
        mRecyclerView.addItemDecoration(dividerItemDecoration);
        mRecyclerView.setAdapter(mRecyclerAdapter);
        mRecyclerView.setLayoutManager(mLayoutManager);

    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Exit Application?")
                .setMessage("Are you sure you want to exit the application?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                   MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
    public void findViews() {

        mRecyclerView = (RecyclerView) findViewById(R.id.mRaceRecyclerView);

    }

    public void addBuildsToDB(){
        BuildData myBuild = new BuildData(getApplicationContext());
        myBuildList = myBuild.getBuildsAndputToList();
        for (int i = 0; i < myBuildList.size(); i++ ) {
        mySQLiteDb.addBuild(myBuildList.get(i));

        }
    }

    public void populateRaceList() {

        for (int i = 0; i < 5; i++) {
            MainCategory race = new MainCategory();
            mList.add(race);
        }

        mList.get(0).NameID = R.string.race_protess;
        mList.get(0).LogoID = R.drawable.ic_vector_protoss_logo;
        mList.get(1).NameID = R.string.race_terran;
        mList.get(1).LogoID = R.drawable.ic_vector_terran_logo;
        mList.get(2).NameID = R.string.race_zerg;
        mList.get(2).LogoID = R.drawable.ic_vector_zerg_logo;
        mList.get(3).NameID = R.string.favorite;
        mList.get(3).LogoID = R.drawable.ic_grade_black_24dp_opaque;
        mList.get(4).NameID = R.string.CreateBuild;
        mList.get(4).LogoID = R.drawable.ic_add_circle_outline_black_24dp;

    }

}

