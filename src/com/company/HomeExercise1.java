package com.company;

import jdk.dynalink.linker.LinkerServices;

import java.util.*;

public class HomeExercise1 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("alpha");
        list.add("bravo");
        list.add("charlie");
        list.add("delta");
        list.add("echo");
        list.add("foxtrot");
        list.add("hurricane2");

//        System.out.println(abcde(list));

        Map<Integer, String> map = new HashMap<>();

        map.put(123, "ABCD");
        map.put(456, "EFGH");
        map.put(789, "IJKL");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        //exercise1
            //System.out.println(concatFirstLetter(list));
        //exercise2
            //removeOddLength(list).forEach(System.out::println);
        //exercise3
            EveryToUpperCase(list);
        //exercise4
            //System.out.println(convertKVToString(map));

        //Exercise5
          //  printNumbers(numbers);


    }

    private static String abcde(List<String> list){
        String results = null;
        StringBuilder sb = new StringBuilder();
        list.forEach(s -> sb.append(s.charAt(0)));
        results = sb.toString();
        return results;
    }

   /**
    *  Exercise 1: -> do not use loops -> use forEach
    *
    *  //list ->  alpha, beta, charlie, delta, elite.
    *  //word -> abcde
    *
    *Create a string that consists of the first letter of each word in
    * the list of Strings provided.
    *
    *  HINT:
    *  Use a StringBuilder to construct the result.
    *
    *
    *
    *
    *
    *
    */

   private static  String concatFirstLetter(List<String> list){

       String result = null;

       StringBuilder sb = new StringBuilder();
       list.forEach(s -> sb.append(s.charAt(0)));
       result = sb.toString();

       return result;

   }

    /**
     * Exercise 2:
     * Remove the words that have odd length s from the list.
     * HINT:
     * Use one of the new methods from JDK 8.
     *
     *
     */

    private static List<String> removeOddLength(List<String> list){
        list.removeIf(s -> s.length()%2>0);
        return list;
    }

    /**
     * Exercise 3:
     * Replace every word in the list with its upper case equivalent.
     * HINT: A
     * gain, use one of the new methods from JDK 8
     */

    private static void EveryToUpperCase(List<String> list){
        list.replaceAll(String::toUpperCase);
        list.forEach(System.out::println);
    }

    /**
     * Exercise 4:
     *
     * Convert every key-value pair of the map into a string
     * and append them all into a single string, in iteration order.
     * HINT:
     * Again, use a StringBuilder to construct the result String.
     * Use one of the new JDK 8 methods for Map.
     *
     */

    private static String convertKVToString(Map<Integer, String> map){
        String results = null;
        StringBuilder sb = new StringBuilder();

        map.forEach((key, value) -> sb.append("Key: " + key + " Value: " + value));

        results = sb.toString();

        return results;


    }

    /**
     *Exercise 5:
     *Create a new Thread that prints the numbers from the list.
     * HINT:
     *This is a straightforward Lambda expression.
     *
     */

    private static void  printNumbers(List<Integer> nums){
       new Thread(() -> nums.forEach(System.out::println)).start();
    }




}
