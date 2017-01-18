package com.example.olivepress.olives;

import java.util.ArrayList;

/**
 * Created by debes on 14-01-2017.
 */
public class OliveJar {

    public static ArrayList<Olive> olives;

    static { // static initializer
        System.out.println("Initializing");
        olives = new ArrayList<>();
        olives.add(new Olive("Kalamata", 0x000000));
        olives.add(new Olive("Picholine", 0x00FF00));
        olives.add(new Olive("Kalamata", 0x000000));
    }

}
