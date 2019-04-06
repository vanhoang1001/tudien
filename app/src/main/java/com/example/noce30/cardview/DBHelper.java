package com.example.noce30.cardview;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="Tudien.db";
    public static final String TABLE_NAME="tudien_table";
    public static final String COL_1="ID";
    public static final String COL_2="TU_TA";
    public static final String COL_3="TU_TV";
    public static final String COL_4="HINH";

    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        //db.execSQL("create table" + TABLE_NAME +"(ID INTEGER PRIMARY KAY AUTOINCREMENT,TU_TA TEXT, TU_TV TEXT, HINH INTEGER )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
