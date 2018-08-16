package com.access.modifiers;

import com.corejava.A;

/**
 * Created by Nageswar on 7/15/2018.
 */
public class Test extends A{
    public Test(int a) {
        super(a);
    }

    public static void main(String[] args) {
        Test a = new Test(10);
        System.out.println(a.a);
        a.methodA();
    }

}
