package com.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Nageswar on 6/23/2018.
 */
public class TestApp {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("A");
        stringList.add("A");
        System.out.println(stringList);
        stringList = stringList.stream().distinct().collect(Collectors.toList());
        System.out.println(stringList);
    }
}
