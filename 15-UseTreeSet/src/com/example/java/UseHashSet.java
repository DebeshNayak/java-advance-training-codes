package com.example.java;

import com.example.olivepress.olives.Kalamata;
import com.example.olivepress.olives.Ligurio;
import com.example.olivepress.olives.Olive;
import com.example.olivepress.olives.Picholine;

import java.util.HashSet;

/**
 * Created by debes on 16-01-2017.
 */
public class UseHashSet {
    public static void main(String[] args){

        Olive lig = new Ligurio();
        Olive kal = new Kalamata();
        Olive pic = new Picholine();

        HashSet<Olive> set = new HashSet<>();
        // Each time an object is added to the TreeSet, the TreeSet will loop through all
        // of its objects and resort them for you.
        set.add(pic);
        set.add(lig);
        set.add(kal);
        System.out.println("There are " + set.size() + " olives in the set.");
        System.out.println(set);

    }
}
