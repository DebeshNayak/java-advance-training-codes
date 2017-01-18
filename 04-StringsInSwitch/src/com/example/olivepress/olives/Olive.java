package com.example.olivepress.olives;

/**
 * Created by debes on 14-01-2017.
 */
public class Olive {

    public String oliveName;
    public long color = 0x000000;

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
