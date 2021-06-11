package com.company;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStudentScores {
    public static void main(String[] args) {


        ArrayList<StudentScores> grades = new ArrayList<>();
        double noOfSubjects = 4;

        grades.add(new StudentScores(123, "Lee", 87, 98, 66, 90));
        grades.add(new StudentScores(1256, "Marion", 88, 78, 60, 80));
        grades.add(new StudentScores(124, "Kim", 58, 54, 87, 87));
        grades.add(new StudentScores(874, "Shiru", 25, 18, 96, 80));
        grades.add(new StudentScores(786, "Wambui", 82, 88, 88, 83));
        grades.add(new StudentScores(135, "Mike", 81, 18, 76, 91));
        grades.add(new StudentScores(114, "Kaary", 56, 68, 55, 92));
        grades.add(new StudentScores(423, "Emily", 88, 54, 87, 93));
        grades.add(new StudentScores(423, "Cate", 18, 14, 47, 13));
        grades.add(new StudentScores(423, "Sheik", 880, 54, 87, 93));

        Map<String, Double> score = grades.stream()
                .collect(Collectors.groupingBy(StudentScores::getName,
                        Collectors.averagingDouble(s -> (s.getAi()
                                + s.getRobotics()
                                + s.getQa()
                                + s.getMaths()) / noOfSubjects)
                ));





        System.out.println("The mean Grade for the exam was " + getMeanGrade(grades));
        printResults(score);



    }


    private static String getGrade(double sc) {
        String grade = null;
            if (sc > 100)
                grade = "Grade above threshold";
            if (sc >= 75 && sc <= 100)
                grade = "A";
            if (sc >= 65 && sc < 75)
                grade = "B";
            if (sc >= 50 && sc < 65)
                grade = "C";
            if (sc >= 40 && sc < 50)
                grade = "D";
            if (sc < 40)
                grade = "F";

            return grade;
    }

    private static void printResults(Map<String, Double> map){
        map.forEach((key, value) -> System.out.println("Name:"
                + key
                + " Score "
                + value
                + " Grade="
                + getGrade(value)));
    }

    private static double getMeanGrade(ArrayList<StudentScores> grades){
        int noOfStudents = grades.size();
        double noOfSubjects = 4.0;

        return grades.stream()
                .map(s -> (s.getMaths() + s.getQa() + s.getRobotics() + s.getAi())/noOfSubjects)
                .reduce(0.0, (d, v) -> (d+v/noOfStudents));
    }
}

