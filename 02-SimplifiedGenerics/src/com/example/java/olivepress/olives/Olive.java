package com.example.java.olivepress.olives;

/**
 * Created by debes on 13-01-2017.
 */
public class Olive {

    public String oliveName = "Kalamata";
    public long color = 0x000000;

    public Olive(){
    }

    public Olive(String oliveName){
        this.oliveName = oliveName;
    }

    public Olive(String oliveName, long color){
        this(oliveName);
        this.color = color;
    }

    @Override
    public String toString() {
        return "name: " + this.oliveName + ": " + "color: " + this.color;
    }
}
