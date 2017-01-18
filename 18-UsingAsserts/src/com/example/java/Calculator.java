package com.example.java;

public class Calculator {

    public static void main(String[] args) {

//        assert true;

        InputHelper helper = new InputHelper();
        String s1 = helper.getInput("Enter a numric value: ");
        assert checkInput(s1);
        String s2 = helper.getInput("Enter a numric value: ");
        assert checkInput(s2);
        String op = helper.getInput("Choose an operation (+ - * /): ");

        double result = 0;


        switch (op) {
            case "+":
                result = MathHelper.addValues(s1, s2);
                break;
            case "-":
                result = MathHelper.substractValues(s1, s2);
                break;
            case "*":
                result = MathHelper.multiplyValues(s1, s2);
                break;
            case "/":
                result = MathHelper.divideValues(s1, s2);
                break;
            default:
                System.out.println("Unrecognized operation!");
                return;
        }

        System.out.println("The answer is " + result);
    }

    private static boolean checkInput(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
