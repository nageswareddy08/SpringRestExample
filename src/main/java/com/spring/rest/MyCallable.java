package com.spring.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by Nageswar on 6/15/2018.
 */
public class MyCallable implements Callable<String> {
    public String call() throws Exception {
        Thread.sleep(1000);
        return Thread.currentThread().getName();
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(0);
        System.out.println(executorService);
        List<Future<String>> futureList = new ArrayList<Future<String>>();
        Callable<String> myCalable =new MyCallable();
        for(int i=0;i<100;i++){
            Future<String> future =executorService.submit(myCalable);
            futureList.add(future);
        }

        for (Future<String> stringFuture:futureList){
                try {
                    System.out.println(new Date()+"::"+stringFuture.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
        }
        executorService.shutdown();
    }
}
