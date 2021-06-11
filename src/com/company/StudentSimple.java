package com.company;

public class StudentSimple {
    String course;
    String name;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentSimple(String course, String name) {
        this.course = course;
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
