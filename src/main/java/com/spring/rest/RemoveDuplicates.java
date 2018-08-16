package com.spring.rest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Nageswar on 6/16/2018.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("A");
        stringList.add("A");
        System.out.println(stringList.stream().collect(Collectors.toList()));
        System.out.println(stringList.stream().distinct().collect(Collectors.toList()));
    }
}
