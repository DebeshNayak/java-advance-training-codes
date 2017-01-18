package com.example.java;

public class Main {

    public static void main(String[] args) {

        int iterations = 5;

        MyThread thread = new MyThread();

        thread.start(); // this results in calling the run method in the custom class

        // own loop that will run both processes at the same time
        try {
            for (int i = 0; i < iterations; i++) {
                System.out.println("from main process");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}
