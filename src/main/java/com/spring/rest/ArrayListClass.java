package com.spring.rest;

import java.util.*;

/**
 * Created by Nageswar on 6/12/2018.
 */
public class ArrayListClass
{
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");

        Iterator<Map.Entry<Integer, String>> set = map.entrySet().iterator();

        while (set.hasNext()){
            System.out.println(set.next());
        }
       Set set1 = map.entrySet();
        for (Iterator it = set1.iterator(); it.hasNext(); ) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey()+""+entry.getValue());
        }
        for (Map.Entry map1: map.entrySet()){
            System.out.println(map1.getKey()+" "+map1.getValue());
        }
    }
}
