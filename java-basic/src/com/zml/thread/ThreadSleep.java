package com.zml.thread;

public class ThreadSleep {

    public static void main(String[] args) {


        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(Thread.currentThread().getName());

            }
        });





        t.start();


    }




}
