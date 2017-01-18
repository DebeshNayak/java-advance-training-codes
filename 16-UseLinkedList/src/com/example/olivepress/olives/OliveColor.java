package com.example.olivepress.olives;

/**
 * Created by debes on 16-01-2017.
 */
public enum OliveColor {
    BLACK("Black"), GREEN("Green"), GOLDEN("Golden");

    private String colorAsString;

    private OliveColor(String colorAsString){
        this.colorAsString = colorAsString;
    }

    @Override
    public String toString() {
        return this.colorAsString;
    }
}
