package com.example.java;

import com.example.olivepress.olives.Ligurio;
import com.example.olivepress.olives.Olive;
import com.example.olivepress.olives.OliveColor;
import com.example.olivepress.olives.OliveName;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) {

        Object o = new Ligurio();

        Class<?> c = o.getClass();
        System.out.println("Class name: " + c.getName());

        Class<?> sup = c.getSuperclass();
        System.out.println("Super name: " + sup.getName());

        Class<?> top = sup.getSuperclass();
        System.out.println("Top name: " + top.getName());

        // to find out the package of a class
        Package p = c.getPackage();
        System.out.println("Package: " + p.getName());
    }
}
