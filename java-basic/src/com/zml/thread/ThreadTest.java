package com.zml.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest {

    public static void main(String[] args) {


        ExecutorService executorService_02 = Executors.newFixedThreadPool(5, new ThreadFactory() {

            private final AtomicInteger threadNumber = new AtomicInteger(1);


            @Override
            public Thread newThread(Runnable r) {

                return new Thread(r, "test--------" + threadNumber.getAndIncrement());
            }
        });



        for (int i = 0; i < 10; i++) {

            executorService_02.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("--------");
                    System.out.println("d:"+Thread.currentThread().getName());
                    System.out.println("=============");

                }
            });
        }

//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        System.out.println("this is sys");
//
//
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });
//
//        try {
//
//
//            Thread.sleep(1);
//
//            t.wait();
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        t.start();
    }

}
