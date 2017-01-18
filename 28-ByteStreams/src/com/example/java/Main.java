package com.example.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try(
//                FileInputStream in = new FileInputStream("textfile.txt");
//                FileOutputStream out = new FileOutputStream("new.txt");
                FileInputStream in = new FileInputStream("screenshot.png");
                FileOutputStream out = new FileOutputStream("newscreenshot.png");
                ){
            int c;
            while ((c = in.read()) != -1){
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
