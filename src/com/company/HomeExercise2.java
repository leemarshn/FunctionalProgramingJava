package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeExercise2 {
    private static final String WORD_REGEXP = "[- .:,]+";

    public static void main(String[] args) {
        System.out.println("Exercise1: ");
        //exercise1();
        System.out.println("Exercise 2");
        //exercise2();
        System.out.println("exercise3");
        //exercise3();
        System.out.println("Exercise4");
//       try {
//           exercise4();
//       }catch (IOException e){
//           System.out.println( "we reached here");
//       }
        System.out.println("Exercise5");
        try {
            exercise7();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Exercise 1
     *
     * Create a new list with all the strings from original list converted to
     * lower case and print them out.
     */
    private static void exercise1() {
        List<String> list = Arrays.asList(
                "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");

        List<String> newList = list.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        newList.forEach(System.out::println);
    }

    /**
     * Exercise 2
     *
     * Modify exercise 1 so that the new list only contains strings that have an
     * odd length
     */
    private static void exercise2() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG"));
        List<String> newList = list.stream()
                .filter(s -> s.length() %2 >=1)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        newList.forEach(System.out::println);

    }
    /**
     * Exercise 3
     *
     * Join the second, third and forth strings of the list into a single string,
     * where each word is separated by a hyphen (-). Print the resulting string.
     */
    private static void exercise3() {
        List<String> list = Arrays.asList(
                "The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");
        String merged = list.stream()
                .skip(1)
                .limit(3)
                .collect(Collectors.joining("-"));
        System.out.println(merged);
    }

    /**
     * Count the number of lines in the file using the BufferedReader provided
     */
    private static void exercise4() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get("src/com/company/Sonnetl.txt"), StandardCharsets.UTF_8)) {
            /* YOUR CODE HERE */
            long noOfLines = reader.lines().count();
            System.out.println("Number of lines: " + noOfLines);
        }
    }

    /**
     * Using the BufferedReader to access the file, create a list of words with
     * no duplicates contained in the file.  Print the words.
     *
     * HINT: A regular expression, WORD_REGEXP, is already defined for your use.
     */
    private static void exercise5() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get("src/com/company/Sonnetl.txt"), StandardCharsets.UTF_8)) {
            /* YOUR CODE HERE */
            List<String> uniqueWords = reader.lines()
                    .flatMap(lines -> Stream.of(lines.split(WORD_REGEXP)))
                    .distinct()
                    .collect(Collectors.toList());
            uniqueWords.stream().forEach(System.out::println);
        }
    }
    /**
     * Using the BufferedReader to access the file create a list of words from the
     * file, converted to lower-case and with duplicates removed, which is sorted
     * by natural order. Print the contents of the list.
     */
    private static void exercise6() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get("src/com/company/Sonnetl.txt"), StandardCharsets.UTF_8)) {
            /* YOUR CODE HERE */
            List<String> uniqueWords = reader.lines()
                    .flatMap(lines -> Stream.of(lines.split(WORD_REGEXP)))
                    .map(String::toLowerCase)
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());
            uniqueWords.stream().forEach(System.out::println);
        }
    }

    private static void exercise7() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get("src/com/company/Sonnetl.txt"), StandardCharsets.UTF_8)) {
            /* YOUR CODE HERE */
            List<String> uniqueWords = reader.lines()
                    .flatMap(lines -> Stream.of(lines.split(WORD_REGEXP)))
                    .map(String::toLowerCase)
                    .distinct()
                    .sorted((s1, s2) -> s1.length()-s2.length())
                    .collect(Collectors.toList());
            uniqueWords.stream().forEach(System.out::println);
        }
    }

}
