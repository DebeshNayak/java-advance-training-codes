package com.example.olivepress.olives;

/**
 * Created by debes on 16-01-2017.
 */
public class Olive { // member class

    public static final long BLACK = 0x000000;

    public OliveName oliveName;
    public long color = BLACK;

    public Olive() {
    }

    public Olive(OliveName oliveName){
        this.oliveName = oliveName;
    }

    public Olive(OliveName oliveName, long color){
        this(oliveName);
        this.color = color;
    }

    public String toString(){
        return "name: " + this.oliveName + ": " + "color: " + this.color;
    }

}
