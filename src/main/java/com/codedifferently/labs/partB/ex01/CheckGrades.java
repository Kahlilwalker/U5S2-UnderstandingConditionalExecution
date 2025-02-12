package com.codedifferently.labs.partB.ex01;

import java.util.Scanner;

public class CheckGrades {

    public static String checkGrades() {
        String response = "";

        Scanner in = new Scanner(System.in);
        int math = 0;
        int ela = 0;
        int science = 0;
        int geo = 0;
        int java = 0;
        System.out.println("Enter your Grade in Math:");
        math = in.nextInt();
        System.out.println("Enter your Grade in Ela:");
        ela = in.nextInt();
        System.out.println("Enter your Grade in Science:");
        science= in.nextInt();
        System.out.println("Enter your Grade in Geography:");
        geo = in.nextInt();
        System.out.println("Enter your Grade in Java:");
        java = in.nextInt();
        in.close();

        int total = math + ela + science + geo + java;

        double average = total / 5;

        response += "Total grade in five subjects: " + total  + "\n" +
                "My percentage: " + average;

        return response;
    }

    public static void main(String args[]) {
        String gradesOutput = checkGrades();
        System.out.println(gradesOutput);
    }
}