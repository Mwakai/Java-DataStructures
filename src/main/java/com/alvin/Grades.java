package com.alvin;

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {

        float[] marks = new float[8];
        float sum = 0;
        float avg;
        int i;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Marks");

        for (i = 0; i < 8; i++){
            for (i = 0; i < 8; i++){
                marks[i] = scanner.nextFloat();
                sum = sum + marks[i];

            }
        }
            avg = sum / 8;
            System.out.println("\n Grade=");
            System.out.println(avg);




    }
}
