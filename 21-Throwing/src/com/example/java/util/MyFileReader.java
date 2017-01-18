package com.example.java.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by debes on 17-01-2017.
 */
public class MyFileReader {

    public static String readFile(String fileName) throws IOException {
        FileReader fr = null;
        BufferedReader br = null;
        StringBuffer sb = new StringBuffer();
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String s;
            while ((s = br.readLine()) != null){
                sb.append(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            fr.close();
            br.close();
        }
        return sb.toString();
    }

}
