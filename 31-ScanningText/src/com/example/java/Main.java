package com.example.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (
                Scanner s = new Scanner(new BufferedReader(new FileReader("tokenizedtext.txt")))
                ){
            s.useDelimiter(","); // if we skip this statament then java will consider the default delimiter as comma.
            while (s.hasNext()){
                System.out.println(s.next());
            }
            System.out.println("All done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
