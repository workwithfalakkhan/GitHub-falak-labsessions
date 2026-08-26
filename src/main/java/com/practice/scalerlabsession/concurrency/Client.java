package com.practice.scalerlabsession.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World using " + Thread.currentThread().getName());

        /*for(int i = 1; i < 1000000; i++){

            Thread thread = new Thread(new NumberPrinter(i));
            thread.start();
        }*/

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i = 1; i < 1000000; i++){
            executorService.execute(new NumberPrinter(i));
        }
        executorService.shutdown();

    }
}
