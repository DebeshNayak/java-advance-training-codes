package com.example.olivepress.olives;

import java.util.ArrayList;

/**
 * Created by debes on 14-01-2017.
 */
public class OliveJar {

    public ArrayList<Olive> olives;

    {   // non-static initializer
        System.out.println("Initializing");
        olives = new ArrayList<>();
        olives.add(new Olive("Golden", 0xDA9100));
    }

    public OliveJar(){
        System.out.println("Constructor...");
    }

    public OliveJar(int nOlives, String oliveName, long color){
        for (int i = 0; i < nOlives; i++) {
            olives.add(new Olive(oliveName, color));

        }
    }

}
