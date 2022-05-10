package com.example.mytask;

import java.util.ArrayList;
import java.util.List;

public class Universrity {
    private String name;

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }

    public University() {
        this.name = name;
    }

    private List<Teacher> teachers = new ArrayList<Teacher>();

    public void addTeacher(Teacher teacher) {
        teacher.add(teacher);
    }

    private List<Subject> subjects = new ArrayList<Subject>();

    public addSubject(Subject subject) {
        subject.add(subject);
    }

    private List<Classroom> classroomы = new ArrayList<Classroom>();

    public void addClassroom(Classroom classroom) {
        classroom.add(classroom);
    }
}
