package com.example.java;

import java.util.Scanner;

/**
 * Created by debes on 17-01-2017.
 */
public class InputHelper {
    protected String getInput (String prompt){
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
