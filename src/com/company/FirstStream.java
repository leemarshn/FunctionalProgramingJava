package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class FirstStream {
    public static void main(String[] args) {
        int passMark = 67;
        List<Integer> grades = new ArrayList<>();
        grades.add(78);
        grades.add(87);
        grades.add(88);
        grades.add(67);
        grades.add(98);
        grades.add(65);
        grades.add(44);
        grades.add(63);
        grades.add(88);

        // get number of people who passed
      long passed =  grades.stream()
                .filter(n -> n > passMark)
                .count();
        System.out.println(passed+ " Students passed the exam out of " + grades.size());

        // get the average score

       // OptionalDouble avg = grades.stream().reduce((a, b) -> a / grades.size());
       // System.out.println(avg.getAsDouble());
                    }
}
