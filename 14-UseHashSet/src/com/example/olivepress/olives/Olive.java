package com.example.olivepress.olives;

/**
 * Created by debes on 16-01-2017.
 */
public class Olive { // extends Object class

    public static final OliveColor BLACK = OliveColor.BLACK;

    public OliveName oliveName;
    public OliveColor color = OliveColor.BLACK;

    public Olive(){}

    public Olive(OliveName oliveName, OliveColor color){
        this.oliveName = oliveName;
        this.color = color;
    }

    public String toString(){
        return "name: " + this.oliveName + ": " + "color: " + this.color;
    }

}
