package com.company;

public class StudentScores {
    private int id;
    private String name;
    private int maths;
    private int qa;
    private int ai;
    private int robotics;

    public StudentScores(int id, String name, int maths, int qa, int ai, int robotics) {
        this.id = id;
        this.name = name;
        this.maths = maths;
        this.qa = qa;
        this.ai = ai;
        this.robotics = robotics;
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

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getQa() {
        return qa;
    }

    public void setQa(int qa) {
        this.qa = qa;
    }

    public int getAi() {
        return ai;
    }

    public void setAi(int ai) {
        this.ai = ai;
    }

    public int getRobotics() {
        return robotics;
    }

    public void setRobotics(int robotics) {
        this.robotics = robotics;
    }

    @Override
    public String toString() {
        return "StudentScores{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maths=" + maths +
                ", qa=" + qa +
                ", ai=" + ai +
                ", robotics=" + robotics +
                '}';
    }
}
