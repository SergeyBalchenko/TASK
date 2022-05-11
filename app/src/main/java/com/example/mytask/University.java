package com.example.mytask;

import java.util.Collections;
import java.util.List;

class University {

    private static final String TAG = "666";
    private final String name = "ONPU";

    private final List<Teacher> teachers = Collections.emptyList();
    private final List<Subject> subjects = Collections.emptyList();
    private final List<Classroom> classrooms = Collections.emptyList();

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(new Teacher());
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void addClassroom(Classroom classroom) {
        classrooms.add(classroom);
    }
}
