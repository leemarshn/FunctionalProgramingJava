package com.company;

public class Students {
    private int id;
    private String name;
    private String course;
    private String gender;
    private double scores;

    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    public Students(int id, String name, String gender, String course, double score) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.gender = gender;
        this.scores = score;
    }

    public Students(String course, String name) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    @Override
//    public String toString() {
//        return "Students{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", course='" + course + '\'' +
//                ", gender='" + gender + '\'' +
//                ", scores=" + scores +
//                '}';
//    }
}
