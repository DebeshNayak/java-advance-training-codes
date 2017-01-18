package com.example.olivepress.olives;

/**
 * Created by debes on 16-01-2017.
 */
public enum OliveName {
    KALAMATA("Kalamata"), LIGURIO("Ligurio"), PICHOLINE("Picholine"), GOLDEN("Golden");

    private String nameAsString;

    private OliveName(String nameAsString){// enum construction should always be private
        this.nameAsString = nameAsString;
    }

    @Override
    public String toString() {
        return this.nameAsString;
    }
}
