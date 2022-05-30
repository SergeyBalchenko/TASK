package com.example.mytask.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.Update;

import java.util.List;

public class Room {

    @Entity
    public class Teacher {

        @PrimaryKey
        public long id;

        public String name;

        public String phone;

        public int age;
    }
    @Dao
    public interface TeacherDao {

        @Query("SELECT * FROM teacher")
        List<Teacher> getAll();

        @Query("SELECT * FROM teacher WHERE id = :id")
        Teacher getById(long id);

        @Insert
        void insert(Teacher teacher);

        @Update
        void update(Teacher teacher);

        @Delete
        void delete(Teacher teacher);

    }
    @Database(entities = {Teacher.class}, version = 1)
    public abstract class AppDatabase extends RoomDatabase {
        public abstract Teacher employeeDao();
    }
}
