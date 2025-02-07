package com.codedifferently.labs.partA.ex03;

import java.util.Scanner;

public class ComputeFare {
    public static int compute (int age){
        int response = 0;
        /* Put your code in between these comments : Top */

        Scanner in = new Scanner(System.in);
        int myAge = 0;
        System.out.println("Enter your age:");
        myAge = in.nextInt();
        in.close();


        if (myAge < 11){
            response += 3;
        }

        if (myAge < 65 && myAge > 11){
            response += 5;
        }

        else {
            response += 3;
        }

        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        int age = 0;
        /* Put your code in between these comments : Top */


        /* Put your code in between these comments : Bottom */

        int computeOutput = compute(age);
        System.out.println(computeOutput);


    }
}
