package com.example.java;

import com.example.olivepress.olives.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Olive> list = new LinkedList<>();
        list.add(new Picholine());
        list.add(new Kalamata());
        list.add(1, new Golden());
        list.addFirst(new Ligurio());

        display(list);

    }

    static private void display(Collection<Olive> col){ // Array of any collection
        System.out.println("List order: ");
        Iterator<Olive> iterator = col.iterator();
        while(iterator.hasNext()){
            Olive olive = (Olive) iterator.next();
            System.out.println(olive.oliveName.toString());
        }
    }
}
