package com.example.billy.starcraftbroodwarbuildlist.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.billy.starcraftbroodwarbuildlist.Models.Builds;

import java.util.ArrayList;
import java.util.List;



public class myDBmanager extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "BUILD_LIST.db";
    private static final int DATABASE_VERSION = 3;
    private static final String BUILD_INFO_TABLE_NAME = "myBuildList";
    private static final String ID_COLUMN = "_id";
    private static final String BUILD_NAME_COLUMN = "BuildName";
    private static final String RACE_COLUMN = "RaceVsRace";
    private static final String DIFFICULTY_COLUMN = "Difficulty";
    private static final String ISFAVORITE_COLUMN = "Favorite";
    private static final String BUILD_NOTES_COLUMN = "BuildNotes";
    private static final String BUILD_ORDER_COLUMN = "BuildOrder";
    private static final String DATABASE_CREATE = "CREATE TABLE " + BUILD_INFO_TABLE_NAME + " ("+ ID_COLUMN + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                                                                                                + BUILD_NAME_COLUMN + " varchar(50), "
                                                                                                + RACE_COLUMN + " varchar(5), "
                                                                                                + BUILD_ORDER_COLUMN + " varchar(1000), "
                                                                                                + BUILD_NOTES_COLUMN + " varchar(1000), "
                                                                                                + DIFFICULTY_COLUMN + " varchar(10), "
                                                                                                + ISFAVORITE_COLUMN + " varchar(10));";

    public myDBmanager(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public List<Builds> getAllBuilds() {
        String sqlQuery = "SELECT * FROM " + BUILD_INFO_TABLE_NAME;
        SQLiteDatabase myDB = getWritableDatabase();
        List<Builds> myBuilds = new ArrayList<>();
        Cursor cursor = myDB.rawQuery(sqlQuery, null);

        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Builds build = new Builds();
                build.setBuildID(cursor.getInt(cursor.getColumnIndex(ID_COLUMN)));
                build.setBuildOrder(cursor.getString(cursor.getColumnIndex(BUILD_ORDER_COLUMN)));
                build.setBuildNotes(cursor.getString(cursor.getColumnIndex(BUILD_NOTES_COLUMN)));
                build.setRaceVsRace(cursor.getString(cursor.getColumnIndex(RACE_COLUMN)));
                build.setBuildFavorite(cursor.getString(cursor.getColumnIndex(ISFAVORITE_COLUMN)));
                build.setBuildName(cursor.getString(cursor.getColumnIndex(BUILD_NAME_COLUMN)));
                build.setBuildDifficulty(cursor.getString(cursor.getColumnIndex(DIFFICULTY_COLUMN)));
                myBuilds.add(build);
                cursor.moveToNext();
            }
        }
            cursor.close();
            myDB.close();
            return myBuilds;
    }



    public List<Builds> getBuildsByRace(String race){
        String sqlQuery = "SELECT * FROM " + BUILD_INFO_TABLE_NAME + " WHERE " + RACE_COLUMN + " = '" + race + "'";
        SQLiteDatabase myDB = getWritableDatabase();
        List<Builds> myBuilds = new ArrayList<>();

        Cursor cursor = myDB.rawQuery(sqlQuery, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while(!cursor.isAfterLast()){
                Builds build = new Builds();
                build.setBuildID(cursor.getInt(cursor.getColumnIndex(ID_COLUMN)));
                build.setBuildOrder(cursor.getString(cursor.getColumnIndex(BUILD_ORDER_COLUMN)));
                build.setBuildNotes(cursor.getString(cursor.getColumnIndex(BUILD_NOTES_COLUMN)));
                build.setRaceVsRace(cursor.getString(cursor.getColumnIndex(RACE_COLUMN)));
                build.setBuildFavorite(cursor.getString(cursor.getColumnIndex(ISFAVORITE_COLUMN)));
                build.setBuildName(cursor.getString(cursor.getColumnIndex(BUILD_NAME_COLUMN)));
                build.setBuildDifficulty(cursor.getString(cursor.getColumnIndex(DIFFICULTY_COLUMN)));
                myBuilds.add(build);
                cursor.moveToNext();
            }
        }
        cursor.close();
        myDB.close();
        return myBuilds;

    }

    public List<Builds> getBuildsByName(String name){
        //name = DatabaseUtils.sqlEscapeString(name);
        //name.r eplaceAll("\'","\'\'");
        //name.replaceAll("\"","\"\"");
        String sqlQuery = "SELECT * FROM " + BUILD_INFO_TABLE_NAME + " WHERE " + BUILD_NAME_COLUMN + " = '" +  name + "'";
        SQLiteDatabase myDB = getWritableDatabase();
        Cursor cursor = myDB.rawQuery(sqlQuery, null);
        List<Builds> myBuilds = new ArrayList<>();
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while(!cursor.isAfterLast()){
                Builds build = new Builds();
                build.setBuildID(cursor.getInt(cursor.getColumnIndex(ID_COLUMN)));
                build.setBuildOrder(cursor.getString(cursor.getColumnIndex(BUILD_ORDER_COLUMN)));
                build.setBuildNotes(cursor.getString(cursor.getColumnIndex(BUILD_NOTES_COLUMN)));
                build.setRaceVsRace(cursor.getString(cursor.getColumnIndex(RACE_COLUMN)));
                build.setBuildFavorite(cursor.getString(cursor.getColumnIndex(ISFAVORITE_COLUMN)));
                build.setBuildName(cursor.getString(cursor.getColumnIndex(BUILD_NAME_COLUMN)));
                build.setBuildDifficulty(cursor.getString(cursor.getColumnIndex(DIFFICULTY_COLUMN)));
                myBuilds.add(build);
                cursor.moveToNext();
            }
        }
        cursor.close();
        myDB.close();
        return myBuilds;
    }

    public List<Builds> getBuildsByFavorite(){

        String sqlQuery = "SELECT * FROM " + BUILD_INFO_TABLE_NAME + " WHERE " + ISFAVORITE_COLUMN + " = '" +  "true" + "'";
        SQLiteDatabase myDB = getWritableDatabase();
        Cursor cursor = myDB.rawQuery(sqlQuery, null);
        List<Builds> myBuilds = new ArrayList<>();
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while(!cursor.isAfterLast()){
                Builds build = new Builds();
                build.setBuildID(cursor.getInt(cursor.getColumnIndex(ID_COLUMN)));
                build.setBuildOrder(cursor.getString(cursor.getColumnIndex(BUILD_ORDER_COLUMN)));
                build.setBuildNotes(cursor.getString(cursor.getColumnIndex(BUILD_NOTES_COLUMN)));
                build.setRaceVsRace(cursor.getString(cursor.getColumnIndex(RACE_COLUMN)));
                build.setBuildFavorite(cursor.getString(cursor.getColumnIndex(ISFAVORITE_COLUMN)));
                build.setBuildName(cursor.getString(cursor.getColumnIndex(BUILD_NAME_COLUMN)));
                build.setBuildDifficulty(cursor.getString(cursor.getColumnIndex(DIFFICULTY_COLUMN)));
                myBuilds.add(build);
                cursor.moveToNext();
            }
        }
        cursor.close();
        myDB.close();
        return myBuilds;
    }

    public List<Builds> getBuildById(int id){

        String sqlQuery = "SELECT * FROM " + BUILD_INFO_TABLE_NAME + " WHERE " + ID_COLUMN + " = '" +  id + "'";
        SQLiteDatabase myDB = getWritableDatabase();
        Cursor cursor = myDB.rawQuery(sqlQuery, null);
        List<Builds> myBuilds = new ArrayList<>();
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            while(!cursor.isAfterLast()){
                Builds build = new Builds();
                build.setBuildID(cursor.getInt(cursor.getColumnIndex(ID_COLUMN)));
                build.setBuildOrder(cursor.getString(cursor.getColumnIndex(BUILD_ORDER_COLUMN)));
                build.setBuildNotes(cursor.getString(cursor.getColumnIndex(BUILD_NOTES_COLUMN)));
                build.setRaceVsRace(cursor.getString(cursor.getColumnIndex(RACE_COLUMN)));
                build.setBuildFavorite(cursor.getString(cursor.getColumnIndex(ISFAVORITE_COLUMN)));
                build.setBuildName(cursor.getString(cursor.getColumnIndex(BUILD_NAME_COLUMN)));
                build.setBuildDifficulty(cursor.getString(cursor.getColumnIndex(DIFFICULTY_COLUMN)));

                myBuilds.add(build);
                cursor.moveToNext();
            }
        }
        cursor.close();
        myDB.close();
        return myBuilds;
    }


    public void addBuild (Builds build) {


        if (!checkIfBuildExists(build)) {
            replaceEscapeChars(build);
            String sqlQuery = "INSERT INTO " + BUILD_INFO_TABLE_NAME + " (" + BUILD_NAME_COLUMN + ", " + RACE_COLUMN + ", " + BUILD_ORDER_COLUMN + ", " + BUILD_NOTES_COLUMN + ", " + DIFFICULTY_COLUMN + ") VALUES (" + "'" + build.buildName + "'" + "," + "'" + build.RaceVsRace + "'" + "," + "'" + build.buildOrder + "'," + " '" + build.buildNotes + "', '"+  build.buildDifficulty +"');";
            SQLiteDatabase myDB = getWritableDatabase();
            myDB.execSQL(sqlQuery);
            myDB.close();
        }

    }


    public boolean updateBuild(Builds build){

        if (build != null) {
            SQLiteDatabase myDB = getWritableDatabase();
            replaceEscapeChars(build);
            String sqlQuery = "SELECT * FROM " + BUILD_INFO_TABLE_NAME + " WHERE " + ID_COLUMN  + " = " + "'" + build.getBuildID() + "';";
            String UpdateQuery = "UPDATE " + BUILD_INFO_TABLE_NAME + " SET " + BUILD_NAME_COLUMN + " = '" + build.getBuildName() + "', " + RACE_COLUMN + " = '" + build.RaceVsRace + "', " + ISFAVORITE_COLUMN + " = '" + build.buildFavorite + "', " + BUILD_ORDER_COLUMN + " = '" + build.buildOrder + "', " + BUILD_NOTES_COLUMN + " = '" + build.buildNotes + "', " + DIFFICULTY_COLUMN + " = " + build.buildDifficulty + " WHERE " + ID_COLUMN + " = '" + build.getBuildID() + "'";
            Cursor cursor = myDB.rawQuery(sqlQuery, null);
            if (cursor.getCount() != 0) {
                cursor.moveToFirst();
                while (!cursor.isAfterLast()) {
                    cursor.moveToNext();
                    myDB.execSQL(UpdateQuery);
                }
                cursor.close();
                myDB.close();
                return true;
            } else
                cursor.close();
            myDB.close();
            return false;
        }
        return true;
    }


    public boolean checkIfBuildExists (Builds build) {

        if (build != null) {
            replaceEscapeChars(build);
            SQLiteDatabase myDB = getWritableDatabase();
            String sqlQuery = "SELECT * FROM " + BUILD_INFO_TABLE_NAME + " WHERE " + BUILD_NAME_COLUMN + " = " + "'" + build.buildName + "';";
            String UpdateQuery = "UPDATE " + BUILD_INFO_TABLE_NAME + " SET " + RACE_COLUMN + " = '" + build.RaceVsRace + "', " + BUILD_ORDER_COLUMN + " = '" + build.buildOrder + "', " + BUILD_NOTES_COLUMN + " = '" + build.buildNotes + "', " + DIFFICULTY_COLUMN + " = " + build.buildDifficulty + " WHERE " + BUILD_NAME_COLUMN + " = '" + build.buildName + "'";
            Cursor cursor = myDB.rawQuery(sqlQuery, null);
            if (cursor.getCount() != 0) {
                cursor.moveToFirst();
                while (!cursor.isAfterLast()) {
                    cursor.moveToNext();
                    myDB.execSQL(UpdateQuery);
                }
                cursor.close();
                myDB.close();
                return true;
            } else
                cursor.close();
            myDB.close();
            return false;
        }
        return true;
    }



    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(DATABASE_CREATE);
    }

    public void deleteBuildById(int id){

        SQLiteDatabase myDB = getWritableDatabase();
        String sqlQuery = "DELETE FROM " + BUILD_INFO_TABLE_NAME + " WHERE " + ID_COLUMN + " = " + id;
        myDB.execSQL(sqlQuery);

    }

    public void DropTable (){

        getWritableDatabase().execSQL("DROP TABLE IF EXISTS " + BUILD_INFO_TABLE_NAME);
        onCreate(getWritableDatabase());

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + BUILD_INFO_TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public void replaceEscapeChars(Builds build){

        build.setBuildName(build.getBuildName().replaceAll("\'", "\'\'"));
        build.setBuildNotes(build.getBuildNotes().replaceAll("\'", "\'\'"));
        build.setBuildOrder(build.getBuildOrder().replaceAll("\'","\'\'"));
        build.setBuildName(build.getBuildName().replaceAll("\"", "\"\""));
        build.setBuildNotes(build.getBuildNotes().replaceAll("\"", "\"\""));
        build.setBuildOrder(build.getBuildOrder().replaceAll("\"","\"\""));

    }

}
