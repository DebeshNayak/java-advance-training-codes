package com.example.java;

import com.example.olivepress.olives.Kalamata;
import com.example.olivepress.olives.Ligurio;
import com.example.olivepress.olives.Olive;
import com.example.olivepress.olives.Picholine;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Olive lig = new Ligurio();
        Olive kal = new Kalamata();
        Olive pic = new Picholine();

        HashSet<Olive> set = new HashSet<>();
        set.add(lig);
        set.add(kal);

        System.out.println("There are " + set.size() + " olives in the set." );

        set.add(pic);
        System.out.println("There are " + set.size() + " olives in the set." );

        set.add(lig);
        System.out.println("There are " + set.size() + " olives in the set." );

        set.add(null);
        System.out.println("There are " + set.size() + " olives in the set." );

        set.remove(lig);
        System.out.println("There are " + set.size() + " olives in the set." );
    }
}
