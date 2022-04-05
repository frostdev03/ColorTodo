package com.frostdev.todolist_11.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.frostdev.todolist_11.dao.TodoDao;
import com.frostdev.todolist_11.entities.Todo;

@Database(entities = Todo.class, version = 1, exportSchema = false)
public abstract class DatabaseHelper extends RoomDatabase {

    private static DatabaseHelper myDB;

    public static synchronized DatabaseHelper getDB(Context context){
        if (myDB == null){
            myDB = Room.databaseBuilder(context, DatabaseHelper.class, "todo_db").build();
        }
        return myDB;
    }

    public abstract TodoDao todoDao();
}