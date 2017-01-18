package com.example.java;

public class Main {

    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.start(); // this results in calling the run method in the custom class

        try {
            // add a sleep for 2500 milli second
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // after 2 and half second call interrupt() on the Thread obj
        thread.interrupt();
        System.out.println("Called interrupt()");

    }
}
