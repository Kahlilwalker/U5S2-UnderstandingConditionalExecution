package com.codedifferently.labs.partB.ex02;

public class Ternary {

    public static String ternary(){
        String response = "";
        /* Put your code here */


        int x = 20;
        int y = 0;
        //int answer1 = (y > x) ?  20 : 1 ;
        int answer = (y > x) ?  1 : 90;
        int answer1 = (y > x) ?  20 : 61;


        response += "Value of y is: " + answer + "\n"
                + "Value of y is: " + answer1;



        return response;


    }
    public static void main(String args[]) {
        String output = ternary();
        System.out.println(output);

    }
}
