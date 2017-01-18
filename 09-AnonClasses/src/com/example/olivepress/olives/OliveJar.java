package com.example.olivepress.olives;

import java.util.ArrayList;
import java.util.Objects;

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

    public void addOlive(String oliveName, long color){
        olives.add(new Olive(oliveName, color));
    }

    public void reportOlives(){
//        class JarLid { // inner class
//            // we can not use static member inside inner class
//            public void open(){
//                System.out.println("Twist, twist, twist...");
//                System.out.println("Pop!");
//            }
//        }
//        new JarLid().open();

        new Object() { // anonymous class
            public void open(){
                System.out.println("Twist, twist, twist...");
                System.out.println("Pop!");
            }
        } .open();

        for ( Olive o: olives ) {
            System.out.println("It's a " + o.oliveName + " olive!!");
        }
    }
}
