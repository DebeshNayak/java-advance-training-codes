package com.example.java;

/**
 * Created by debes on 18-01-2017.
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() { // required method of the Runnable interface
        int iterations = 5;
        try {
            for (int i = 0; i < iterations; i++) {
                System.out.println("From Runnable");
                Thread.sleep(1500); // static method of the thread class
            }
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}
