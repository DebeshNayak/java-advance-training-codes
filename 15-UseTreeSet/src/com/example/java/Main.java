package com.example.java;

import com.example.olivepress.olives.Kalamata;
import com.example.olivepress.olives.Ligurio;
import com.example.olivepress.olives.Olive;
import com.example.olivepress.olives.Picholine;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Olive lig = new Ligurio();
        Olive kal = new Kalamata();
        Olive pic = new Picholine();

        TreeSet<Olive> set = new TreeSet<>();
        try {
            set.add(lig);
            set.add(kal);
            set.add(pic);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(set);
    }
}
