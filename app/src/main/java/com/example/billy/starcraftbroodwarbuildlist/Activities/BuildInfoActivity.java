package com.example.billy.starcraftbroodwarbuildlist.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.billy.starcraftbroodwarbuildlist.Database.myDBmanager;
import com.example.billy.starcraftbroodwarbuildlist.Models.Builds;
import com.example.billy.starcraftbroodwarbuildlist.R;
import java.util.ArrayList;
import java.util.List;

public class BuildInfoActivity extends AppCompatActivity {


    TextView mBuildOrder;
    TextView mBuildNotes;
    ImageView buildInfoFavIcon;
    String ChosenBuildName;
    int ChosenBuildID;
    List<Builds> ChosenBuildInfo;
    myDBmanager mydb;


    @Override
    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        super.setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(ChosenBuildName);
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
        setContentView(R.layout.activity_build_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.buildinfotoolbar);

        findViews();
        mBuildOrder.setMovementMethod(new ScrollingMovementMethod());
        mBuildNotes.setMovementMethod(new ScrollingMovementMethod());
        Intent mIntent = getIntent();
        mydb = new myDBmanager(this);
        ChosenBuildInfo = new ArrayList<>();
        ChosenBuildName = mIntent.getStringExtra("BuildChosen");
        ChosenBuildID = mIntent.getIntExtra("BuildIDChosen", 0);
        ChosenBuildInfo = mydb.getBuildById(ChosenBuildID);

        setSupportActionBar(toolbar);
        mBuildOrder.setText(ChosenBuildInfo.get(0).buildOrder);
        mBuildNotes.setText(ChosenBuildInfo.get(0).buildNotes);
        if (ChosenBuildInfo.get(0).getBuildFavorite() != null && ChosenBuildInfo.get(0).getBuildFavorite().equals("true")){

            buildInfoFavIcon.setImageResource(R.drawable.ic_star_yellow_24dp);

        }else{

            buildInfoFavIcon.setImageResource(R.drawable.ic_filledstar);

        }

    }

    public void findViews(){

        mBuildOrder = (TextView) findViewById(R.id.build_order_list);
        mBuildNotes = (TextView) findViewById(R.id.build_notes);
        buildInfoFavIcon = (ImageView) findViewById(R.id.BuildInfoFavIcon);
    }

}
