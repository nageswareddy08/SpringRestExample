package com.spring.rest;

/**
 * Created by Nageswar on 6/14/2018.
 */
public class RunnableThread implements Runnable {
    public void run() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Runnable runnable = new RunnableThread();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
