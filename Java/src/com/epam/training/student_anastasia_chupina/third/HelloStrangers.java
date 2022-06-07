package com.epam.training.student_anastasia_chupina.third;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner Scanner = new Scanner(System.in);
        int number = Scanner.nextInt();
        int i = 0;
        if (number>0) {
             while (i <= number) {
                i++;
                String name = Scanner.nextLine();
                if (i == 1) {

                } else {
                    System.out.println("Hello, " + name);
                }
            }
        } else if (number == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
            System.out.println("Seriously? Why so negative?");
        }
    }
}
