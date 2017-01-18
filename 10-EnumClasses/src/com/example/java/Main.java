package com.example.java;

import com.example.olivepress.olives.OliveJar;
import com.example.olivepress.olives.OliveName;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        OliveJar jar = new OliveJar();
        jar.addOlive(OliveName.KALAMATA, 0x000000);
        jar.addOlive(OliveName.LIGURIO, 0x000000);
        jar.addOlive(OliveName.PICHOLINE, 0x000000);
        jar.reportOlives();

    }
}
