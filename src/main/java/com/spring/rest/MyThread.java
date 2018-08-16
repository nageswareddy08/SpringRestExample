package com.spring.rest;

/**
 * Created by Nageswar on 6/14/2018.
 */
public class MyThread extends Thread {
    public void run(){
        System.out.println("Running....");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
