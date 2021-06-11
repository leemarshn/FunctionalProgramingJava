package com.company;

import java.util.Comparator;
import java.util.TreeSet;

public class Sorted implements Comparable<Sorted>{
    private int num;
    private String text;



    //	Assume	getters/setters/constructors	provided


    public Sorted(int num, String text) {
        this.num = num;
        this.text = text;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        return "" + num;
    }

    public int compareTo(Sorted s) {
        return text.compareTo(s.text);
    }

    //int compare(T t, U u);
    public int compare(Sorted s1, Sorted s2) {
        return s1.num - s2.num;
    }

    public static void main(String[] args) {
        var s1 = new Sorted(88, "a");
        var s2 = new Sorted(55, "b");
        var t1 = new TreeSet<Sorted>();
        Comparator<Sorted> cp = (o1, o2) -> o1.num - o2.num;
        t1.add(s1);
        t1.add(s2);
        var t2 = new TreeSet<Sorted>(cp);
        t2.add(s1);
        t2.add(s2);
        System.out.println(t1 + "	" + t2);
        // t1 = 88, 55 t2 = 88, 55
        // t1 = 88, 55 t2 = 55, 88
    }
}

