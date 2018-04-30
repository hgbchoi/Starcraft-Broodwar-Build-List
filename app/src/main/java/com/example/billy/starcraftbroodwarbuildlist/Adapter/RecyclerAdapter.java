package com.example.billy.starcraftbroodwarbuildlist.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.billy.starcraftbroodwarbuildlist.Activities.BuildInfoActivity;
import com.example.billy.starcraftbroodwarbuildlist.Activities.BuildListActivity;
import com.example.billy.starcraftbroodwarbuildlist.Activities.CreateBuildActivity;
import com.example.billy.starcraftbroodwarbuildlist.Activities.RaceVSActivity;
import com.example.billy.starcraftbroodwarbuildlist.Database.myDBmanager;
import com.example.billy.starcraftbroodwarbuildlist.Models.Builds;
import com.example.billy.starcraftbroodwarbuildlist.Models.MainCategory;
import com.example.billy.starcraftbroodwarbuildlist.R;

import java.util.ArrayList;
import java.util.List;

/*
 * Created by billy on 2017-07-25.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.myViewHolder>{

    List<Builds> mBuildList;
    List<MainCategory> mRaceList;
    ArrayList<String> mRaceVSList;
    myDBmanager mydbManager;
    RecyclerView mRecycler;
    Context context;
    String page;


    public RecyclerAdapter (Context context, ArrayList<String> RaceVSList, RecyclerView mRecycler, String page){
        this.context = context;
        this.mRaceVSList = RaceVSList;
        this.mRecycler = mRecycler;
        this.page = page;
    }
    public RecyclerAdapter (Context context , RecyclerView mRecycler ,String page, List<Builds> buildList){
        this.context = context;
        mBuildList = buildList;
        this.mRecycler = mRecycler;
        this.page = page;
    }
    public RecyclerAdapter (Context context, List<MainCategory> mRaceList, RecyclerView mRecycler, String page){

        this.mRaceList = mRaceList;
        this.mRecycler = mRecycler;
        this.context = context;
        this.page = page;
    }

    public class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView mRaceText;
        TextView mRaceVSText;
        RelativeLayout mMainRowId;
        ImageView mRaceImage;
        ImageView mListContextMenuIcon;
        ImageView mVsRaceIcon;
        TextView mBuildName;

        public myViewHolder(View itemView) {
            super(itemView);

            if (page.equals("RaceList")) {

                mMainRowId = (RelativeLayout) itemView.findViewById(R.id.mainRowId);
                mRaceText = (TextView) itemView.findViewById(R.id.mRaceText);
                mRaceImage = (ImageView) itemView.findViewById(R.id.mRaceImage);
                mRaceText.setOnClickListener(this);



            }else if (page.equals("OpponentRaceSelection")){

                mRaceVSText = (TextView) itemView.findViewById(R.id.mRaceVSText);
                mVsRaceIcon = (ImageView) itemView.findViewById(R.id.opponentSelectionIcon);
                mRaceVSText.setOnClickListener(this);
            }else if (page.equals("BuildList")){

                mBuildName = (TextView) itemView.findViewById(R.id.buildName);
                mListContextMenuIcon = (ImageView) itemView.findViewById(R.id.mListContextMenuIcon);
                mListContextMenuIcon.setOnClickListener(this);
                mBuildName.setOnClickListener(this);
            }
        }

        @Override
        public void onClick(View view) {

            Intent i = new Intent(context, RaceVSActivity.class);
            Intent l = new Intent(context, BuildListActivity.class);
            Intent p = new Intent(context, CreateBuildActivity.class);
            ArrayList<String> RaceVSList = new ArrayList<>();
            if (page == "RaceList"){
                int position = getAdapterPosition();
                if (position == 0){


                }



            }
            switch (view.getId()) {


                case (R.id.mRaceText):

                    switch (mRaceList.get(getAdapterPosition()).NameID) {

                        case R.string.race_protess:
                            RaceVSList.clear();
                            RaceVSList.add((String) context.getText(R.string.PvP));
                            RaceVSList.add((String) context.getText(R.string.PvZ));
                            RaceVSList.add((String) context.getText(R.string.PvT));
                            i.putStringArrayListExtra("VS", RaceVSList);
                            view.getContext().startActivity(i);
                            break;

                        case R.string.race_terran:
                            RaceVSList.clear();
                            RaceVSList.add((String) context.getText(R.string.TvP));
                            RaceVSList.add((String) context.getText(R.string.TvT));
                            RaceVSList.add((String) context.getText(R.string.TvZ));
                            i.putStringArrayListExtra("VS", RaceVSList);
                            view.getContext().startActivity(i);
                            break;

                        case R.string.race_zerg:
                            RaceVSList.clear();
                            RaceVSList.add((String) context.getText(R.string.ZvP));
                            RaceVSList.add((String) context.getText(R.string.ZvZ));
                            RaceVSList.add((String) context.getText(R.string.ZvT));
                            i.putStringArrayListExtra("VS", RaceVSList);
                            view.getContext().startActivity(i);
                            break;

                        case R.string.favorite:
                            l.putExtra("RaceVsChosen", "FavoriteBuilds");
                            view.getContext().startActivity(l);
                            break;

                        case R.string.CreateBuild:
                            p.putExtra("ActivityForm", "Create");
                            view.getContext().startActivity(p);

                    }
                    break;
                case (R.id.buildName):
                    Intent k = new Intent(context, BuildInfoActivity.class);
                    k.putExtra("BuildChosen", mBuildList.get(getAdapterPosition()).buildName);
                    k.putExtra("BuildIDChosen", mBuildList.get(getAdapterPosition()).buildID);
                    view.getContext().startActivity(k);
                    break;

                case (R.id.mRaceVSText):
                    Intent j = new Intent(context, BuildListActivity.class);
                    j.putExtra("RaceVsChosen", mRaceVSList.get(getAdapterPosition()));
                    Toast.makeText(context, mRaceVSList.get(getAdapterPosition()) + " clicked", Toast.LENGTH_LONG).show();
                    view.getContext().startActivity(j);
                    break;
                case (R.id.mListContextMenuIcon):
                    @SuppressLint("RestrictedApi") Context wrapper = new ContextThemeWrapper(context, R.style.popupMenuStyle);
                    final PopupMenu popup = new PopupMenu(wrapper, view, Gravity.END);
                    popup.inflate(R.menu.build_list_menu);

                    popup.show();

                    popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                        @Override
                        public boolean onMenuItemClick(MenuItem item) {
                            mydbManager = new myDBmanager(context);
                            switch (item.getItemId()) {
                                case R.id.favorite_build:

                                    if (mBuildList.get(getAdapterPosition()).getBuildFavorite() == null || !mBuildList.get(getAdapterPosition()).getBuildFavorite().equals("true")){
                                        mBuildList.get(getAdapterPosition()).setBuildFavorite("true");
                                        Toast.makeText(context, mBuildList.get(getAdapterPosition()).getBuildName() + " Set To Favorite", Toast.LENGTH_LONG ).show();
                                    }else{
                                        mBuildList.get(getAdapterPosition()).setBuildFavorite("false");
                                        Toast.makeText(context, mBuildList.get(getAdapterPosition()).getBuildName() + " Removed From Favorites", Toast.LENGTH_LONG ).show();
                                    }
                                    mydbManager.updateBuild(mBuildList.get(getAdapterPosition()));
                                    notifyDataSetChanged();
                                    break;
                                case R.id.edit_build:

                                    Intent i = new Intent(context , CreateBuildActivity.class);
                                    i.putExtra("ActivityForm","Edit");
                                    i.putExtra("EditingBuild", mBuildList.get(getAdapterPosition()));
                                    context.startActivity(i);


                                    break;
                                case R.id.delete_build:
                                    new AlertDialog.Builder(context).setCancelable(false).setMessage("Are you sure you want to delete the build: " + mBuildList.get(getAdapterPosition()).getBuildName() + "?")
                                            .setTitle("Delete Build")
                                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                                public void onClick(DialogInterface dialog, int id) {
                                                    mydbManager.deleteBuildById(mBuildList.get(getAdapterPosition()).getBuildID());
                                                    mBuildList.remove(getAdapterPosition());
                                                    notifyDataSetChanged();
                                                }
                                            }).setNegativeButton("Cancel", null).show();
                            }
                            return false;
                        }
                    });
            }
            }
    }



    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType)  {
        View rowView = null;
        if (page.equals("RaceList")) {
            rowView = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_row, null);
        }else if (page.equals("OpponentRaceSelection")) {
            rowView = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_row_possible_race, null);
        }else if (page.equals("BuildList")){
            rowView = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_row_buidlist, null);
        }

        return new myViewHolder(rowView);
    }


    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {

        if (page.equals("RaceList")) {
            holder.mRaceText.setText(mRaceList.get(position).NameID);
            holder.mRaceImage.setImageResource(mRaceList.get(position).LogoID);
        }else if (page.equals("OpponentRaceSelection")){
            holder.mRaceVSText.setText(mRaceVSList.get(position));
            holder.mVsRaceIcon.setImageResource(R.drawable.ic_arrow_forward_black_24dp);
        }else if (page.equals("BuildList")){
            holder.mBuildName.setText(mBuildList.get(position).buildName);
            holder.mListContextMenuIcon.setImageResource(R.drawable.ic_more_vert_black_24dp) ;

        }
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {

        if (page.equals("RaceList")) {
            return mRaceList.size();
        }else if (page.equals("OpponentRaceSelection")) {
            return mRaceVSList.size();
        } else if (page.equals("BuildList")) {
            return mBuildList.size();
        }
        return -1;
    }






}

