package com.spring.rest;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Nageswar on 6/14/2018.
 */
public class HashSetEqualsMethodImportance {
    public static void main(String[] args) {

        SortedSet<Integer> setWithNaturalOrdering = new TreeSet<Integer>();
        setWithNaturalOrdering.add(5);
        setWithNaturalOrdering.add(9);
        setWithNaturalOrdering.add(4);
        setWithNaturalOrdering.add(2);
        for (Integer numbers:setWithNaturalOrdering
             ) {
            System.out.println(numbers);
        }
    }

}
