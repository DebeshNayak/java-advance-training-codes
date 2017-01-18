package com.example.java;

import com.example.olivepress.olives.Olive;
import com.example.olivepress.olives.OliveColor;
import com.example.olivepress.olives.OliveName;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) {

        Olive o = new Olive(OliveName.LIGURIO, OliveColor.BLACK);

        Class<?> c = o.getClass(); // Class's class - get reference to class's class

        System.out.println(c);
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());

        // get reference to all of the constructor as an array
        Constructor<?>[] constructors = c.getConstructors();
        System.out.println("Number of constructors: " + constructors.length);
        // get reference to the constructor at position 0
        Constructor<?> con = constructors[0];
        // declare object and assign it to null
        Object obj = null;

        try {
            // instantiating
            obj = con.newInstance(OliveName.PICHOLINE, OliveColor.GREEN);
            System.out.println(obj);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
