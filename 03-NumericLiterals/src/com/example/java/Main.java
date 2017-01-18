package com.example.java;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        //int numberOfOlives = 1_000_000;
        int numberOfOlives = 1000000;
        //System.out.println("Number is: " + numberOfOlives);
        NumberFormat formatter = NumberFormat.getInstance();
        // This will output a numeric value, and add thousand separators based on the default locale.
        System.out.println(formatter.format(numberOfOlives));
    }
}
