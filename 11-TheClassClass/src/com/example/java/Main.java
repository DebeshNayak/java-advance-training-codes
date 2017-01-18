package com.example.java;

import com.example.olivepress.olives.Olive;
import com.example.olivepress.olives.OliveName;

public class Main {

    public static void main(String[] args) {

        Olive o = new Olive(OliveName.PICHOLINE, 0x00FF00);

        Class<?> c = o.getClass(); // Class's class - get reference to class's class

        System.out.println(c);
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());

    }
}
