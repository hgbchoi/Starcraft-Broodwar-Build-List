package com.example.billy.starcraftbroodwarbuildlist.Activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.billy.starcraftbroodwarbuildlist.Database.myDBmanager;
import com.example.billy.starcraftbroodwarbuildlist.Models.Builds;
import com.example.billy.starcraftbroodwarbuildlist.R;

public class CreateBuildActivity extends AppCompatActivity {

    EditText buildNotesEditText;
    EditText buildOrderEditText;
    EditText buildNameEditText;
    Toolbar createBuildToolbar;
    Spinner yourRaceSpinner;
    Spinner opponentRaceSpinner;
    Button doneButton;
    String [] raceSpinner;
    Intent p;


    @Override
    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        super.setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Create/Edit Build");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }


    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Create/Edit Build")
                .setMessage("Are you sure you want to quit creating/editing the build? All changes will be lost!")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                      CreateBuildActivity.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_build);
        findViews();
        setSupportActionBar(createBuildToolbar);
        raceSpinner = new String[] {
                "Protoss", "Terran", "Zerg"
        };

        ArrayAdapter<String> raceAdapter = new ArrayAdapter<>(this, R.layout.race_spinner_row_textview, raceSpinner);
        raceAdapter.setDropDownViewResource(R.layout.race_spinner_row_textview);
        yourRaceSpinner.setAdapter(raceAdapter);
        opponentRaceSpinner.setAdapter(raceAdapter);

        doneButton.setOnClickListener(new EventHandler());
        p = getIntent();
        if (p.getStringExtra("ActivityForm").equals("Edit")){

            Builds mBuild = new Builds();
            mBuild = (Builds) p.getSerializableExtra("EditingBuild");
            buildNotesEditText.setText(mBuild.getBuildNotes());
            buildOrderEditText.setText(mBuild.getBuildOrder());
            buildNameEditText.setText(mBuild.getBuildName());
            setSpinner(mBuild.getRaceVsRace());

        }

    }

    public void findViews(){

        buildNotesEditText = (EditText) findViewById(R.id.BuildNotesCreateBuild);
        buildOrderEditText = (EditText) findViewById(R.id.buildordercreatebuild);
        buildNameEditText = (EditText) findViewById(R.id.BuildNameCreateBuild);
        createBuildToolbar = (Toolbar) findViewById(R.id.createbuildtoolbar);
        yourRaceSpinner = (Spinner) findViewById(R.id.yourracespinner);
        opponentRaceSpinner = (Spinner) findViewById(R.id.opponentracespinner);
        doneButton = (Button) findViewById (R.id.doneButton);
    }

    class EventHandler implements View.OnClickListener{

        myDBmanager  mDbmanager = new myDBmanager(getApplicationContext());

        @Override
        public void onClick(View view) {

            switch (view.getId()){
                case R.id.doneButton:

                    new AlertDialog.Builder(view.getContext())
                            .setTitle("Create/Edit Build")
                            .setMessage("Are you sure you have finished creating/editing the build?")
                            .setCancelable(false)
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    if (buildNameEditText.length() == 0){

                                        buildNameEditText.setError("Please Enter A Build Name");

                                    }if (buildOrderEditText.length() == 0){

                                        buildOrderEditText.setError("Please Set The Build Order");

                                    }else if (buildNameEditText.length() != 0 && buildOrderEditText.length() != 0) {

                                        Builds mBuild = new Builds();
                                        mBuild.setBuildName(buildNameEditText.getText().toString());
                                        mBuild.setBuildNotes(buildNotesEditText.getText().toString());
                                        mBuild.setBuildOrder(buildOrderEditText.getText().toString());
                                        mBuild.setRaceVsRace(yourRaceSpinner.getSelectedItem().toString().charAt(0) + " v " + opponentRaceSpinner.getSelectedItem().toString().charAt(0));

                                        if (p.getStringExtra("ActivityForm").equals("Edit")) {

                                            Builds oldBuild = new Builds();
                                            oldBuild = (Builds) p.getSerializableExtra("EditingBuild");
                                            mBuild.setBuildID(oldBuild.buildID);
                                            mBuild.setBuildFavorite(oldBuild.buildFavorite);
                                            mDbmanager.updateBuild(mBuild);
                                        } else {
                                            if (!mDbmanager.checkIfBuildExists(mBuild)) {
                                                mDbmanager.addBuild(mBuild);
                                            }
                                        }
                                        Intent I = new Intent(getApplicationContext(), MainActivity.class);
                                        I.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                        startActivity(I);
                                        finish();

                                    }
                                }
                            })
                            .setNegativeButton("No", null)
                            .show();
            }
        }
    }

    public void setSpinner(String rvr){

        switch (rvr.charAt(0)) {

            case 'P':
                yourRaceSpinner.setSelection(0);
                break;
            case 'T':
                yourRaceSpinner.setSelection(1);
                break;
            case 'Z':
                yourRaceSpinner.setSelection(2);
                break;
        }


        switch (rvr.charAt(4)) {

            case 'P':
                opponentRaceSpinner.setSelection(0);
                break;
            case 'T':
                opponentRaceSpinner.setSelection(1);
                break;
            case 'Z':
                opponentRaceSpinner.setSelection(2);
                break;
        }


    }

}

