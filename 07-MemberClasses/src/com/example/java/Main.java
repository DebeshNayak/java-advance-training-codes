package com.example.java;

import com.example.olivepress.olives.OliveJar;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        OliveJar jar = new OliveJar();
        jar.addOlive("Kalamata", 0x000000);
        jar.addOlive("Kalamata", 0x000000);
        jar.addOlive("Kalamata", 0x000000);
        jar.addOlive("Kalamata", 0x000000);
        jar.reportOlives();

    }
}
