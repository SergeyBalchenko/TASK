package com.example.mytask;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.Update;

import androidx.room.Database;
import androidx.room.Query;

import java.util.List;

 class Teacher {
     public Teacher(long id) {
         this.id = id;
     }

     public long getId() {
         return id;
     }

     public void setId(long id) {

         this.id = id;
     }

     private long id;
     private String name;
     private String phone;
     private int age;

     public Teacher(String name, String phone, int age) {
         this.name = name;
         this.phone = phone;
         this.age = age;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setPhone(String phone) {
         this.phone = phone;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public String getName() {
         return name;
     }

     public String getPhone() {
         return phone;
     }

     public int getAge() {
         return age;
     }

     @Override
     public String toString() {
         return "Teacher{" +
                 "name='" + name + '\'' +
                 ", phone='" + phone + '\'' +
                 ", age=" + age +
                 '}';
     }
 }
