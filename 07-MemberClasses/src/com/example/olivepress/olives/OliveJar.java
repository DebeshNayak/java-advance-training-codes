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

    public void addOlive(String oliveName, long color){
        olives.add(new Olive(oliveName, color));
    }

    public void reportOlives(){
        for ( Olive o: olives ) {
            System.out.println("It's a " + o.oliveName + " olive!!");
        }
    }

    class Olive {

        public static final long BLACK = 0x000000;

        public String oliveName;
        public long color = BLACK;

        public Olive() {
        }

        public Olive(String oliveName){
            this.oliveName = oliveName;
        }

        public Olive(String oliveName, long color){
            this(oliveName);
            this.color = color;
        }

        public String toString(){
            return "name: " + this.oliveName + ": " + "color: " + this.color;
        }

    }
}
