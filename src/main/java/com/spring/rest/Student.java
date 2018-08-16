package com.spring.rest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Nageswar on 6/12/2018.
 */
public class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int compareTo(Student o) {
        if (age==o.age){
        return 0;
        }else if(age>o.age){
            return  1;
        }else {
        return -1;}
    }

    public static void main(String[] args) {
        List<String> items = new ArrayList<String>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");


    }
}
