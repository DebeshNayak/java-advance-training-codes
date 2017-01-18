package com.example.java;

import com.example.java.exceptions.WrongFileException;
import com.example.java.util.MyFileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String fileContents = MyFileReader.readFile("TextFile2.txt");
        System.out.println(fileContents);
        // so when we get the text "Wrong file" we need to throw our own exception
        try {
            if (fileContents.equals("Right file")){
                System.out.println("You chose the right file!");
            }else{
                // this throw excetion into the catch block
                throw(new WrongFileException());
            }
        } catch (WrongFileException e) {
            System.out.println(e.getMessage());
        }
    }
}
