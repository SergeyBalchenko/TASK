package com.example.mytask;
import java.util.ArrayList;
public class Schedule {
}
public class University {
    private String name;

    public String getName() {
        return name;
    }
    public University() {
        this.name = name;
    }
}
private class ScheduleDay {
    ArrayList<String> subject = new ArrayList<String>();
            subjectsList.add(subject);
}
public class Subject {
    String name;
    String location;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
public class Classroom {
    String name;
    String location;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
    }
    public class Teacher {
    String name;
    String phone;
    int age;
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
}