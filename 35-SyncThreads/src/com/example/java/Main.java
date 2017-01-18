package com.example.java;

public class Main {

    public static void main(String[] args) {

        // here we are creating single instance of the target object
        TargetClass target = new TargetClass();

        // we are passing that same reference into all three thread objects
        MyThread t1 = new MyThread(1, target);
        MyThread t2 = new MyThread(2, target);
        MyThread t3 = new MyThread(3, target);

        t1.start();
        t2.start();
        t3.start();

    }
}
