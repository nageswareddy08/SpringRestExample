package com.spring.rest;

/**
 * Created by Nageswar on 6/11/2018.
 */
public class Constructor {
    int id;
    String name;

    public Constructor() {
        super();
        System.out.println("Arguments constructor");
        this.id = id;
        this.name = name;
    }


    public static void main(String[] args) {
       // Constructor constructorONE = new Constructor(1,"NAME");
        Constructor constructor = new Constructor();
    }
}
