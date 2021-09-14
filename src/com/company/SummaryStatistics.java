package com.company;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SummaryStatistics {
    public static void main(String[] args) {

        //.... collections

        //LongStream
        //DS
        //IS

        var stream =  IntStream.rangeClosed(1,100);
        IntSummaryStatistics statistics = stream.summaryStatistics();

        double average = statistics.getAverage();
        double sum = statistics.getSum();
        double min = statistics.getMin();
        double max = statistics.getMax();

        System.out.println("av: " + average);
        System.out.println("sum: " + sum);
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("count: " + statistics.getCount());
    }
}
