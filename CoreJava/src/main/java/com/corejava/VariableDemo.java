package com.corejava;

/**
 * Created by Nageswar on 7/15/2018.
 */
public class VariableDemo {
    int a;
    static int b = 20;
    public  void print(){
        int c =10;
        System.out.println("Method local variable"+c);
    }

    public static void main(String[] args) {
        VariableDemo variableDemo = new VariableDemo();
        System.out.println("Instance Variable "+ variableDemo.a);
        System.out.println("static Variable "+ b);
        variableDemo.print();

    }
}
