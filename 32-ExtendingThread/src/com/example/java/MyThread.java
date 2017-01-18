package com.example.java;

/**
 * Created by debes on 18-01-2017.
 */
public class MyThread extends Thread{

    @Override
    public void run() { // this method will be called when the thread is instantiated and started
        int iterations = 5;
        try {
            for (int i = 0; i < iterations; i++) {
                System.out.println("From secondary thread");
                sleep(2000); // static method of the thread class
            }
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}
