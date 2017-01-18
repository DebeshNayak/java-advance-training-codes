package com.example.java;

import com.example.java.olivepress.olives.Olive;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        Olive o1 = new Olive("Kalamata", 0x00FF00);
        Olive o2 = new Olive("Picholine", 0x00FF00);
        Olive o3 = new Olive("Ligurio", 0x000000);

        // Olive[] olives = {o1, o2, o3};
        ArrayList<Olive> olives1 = new ArrayList<>();
        olives1.add(o1);
        olives1.add(o2);
        olives1.add(o3);
        System.out.println(olives1);
    }
}
