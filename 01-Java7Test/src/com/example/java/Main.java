package com.example.java;

public class Main {

    public static void main(String[] args) {
	    String key = "One";

	    switch(key){// Java SE 7 and later support String data type inside switch statement
            case "One":
                System.out.println("This value is One");
                break;
            default:
                System.out.println("This value isn't One");
                break;
        }
    }
}
