package com.example.java;

import com.example.olivepress.olives.Olive;
import com.example.olivepress.olives.OliveJar;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting application");
        ArrayList<Olive> olives_obj = OliveJar.olives;
        System.out.println("After initialization");
        for (Olive o:olives_obj){
            System.out.println("It's a " + o.oliveName + " olives!");
        }

    }
}
