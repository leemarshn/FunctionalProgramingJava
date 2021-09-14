package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Students> studentsList = new ArrayList<>();

        studentsList.add( new Students(1,"Lee", "Male", "C/S", 52));
        studentsList.add( new Students(11,"Mary", "Female", "C/S", 56));
        studentsList.add( new Students(111,"Kate", "Female", "Accounts",89));
        studentsList.add( new Students(1111,"Simon", "Male", "C/S", 98));
        studentsList.add( new Students(11111,"John", "Male", "C/S", 87));
        studentsList.add( new Students(111112,"Emily", "Female", "Law", 56));
        studentsList.add( new Students(21,"Mercy", "Female", "Law",65));
        studentsList.add( new Students(112,"Ken", "Male", "Accounts", 85));





        Map<String,Double> map = studentsList.stream()
                .collect(Collectors.groupingBy(Students::getCourse,
                        Collectors.averagingDouble(Students::getScores)));
////
//        System.out.println("printing average score for each course");
//        map.forEach((key, value) -> System.out.println(key + "=" + value));

//        Map<String, List<String>> names = studentsList.stream()
//                .collect(Collectors.groupingBy(Students::getCourse,
//                        Collectors.mapping( s -> s.getName() +" " + s.getScores(),
//                                Collectors.toList())));
//
//        System.out.println("printing students names and score");
//        names.forEach((k, v) -> System.out.println(k + "={" + v +"}"));








       // names.entrySet().forEach(e -> System.out.println(e.getValue()));


//        System.out.println("printing students names and score");
//        names.forEach((k, v) -> System.out.println(k + "={" + v +"}"));




    }
}
