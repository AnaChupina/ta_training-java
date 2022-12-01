package com.epam.training.student_anastasiia_chupina.third;

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int sum = Scanner.nextInt();
        int friends = Scanner.nextInt();
        if (sum >= 0) {
            if (friends > 0) {
                int part = (int) Math.round((sum*1.1)/friends);
                System.out.println(part);
            } else {
                System.out.println("Number of friends cannot be negative or zero");
            }
        } else {
            System.out.println("Bill total amount cannot be negative");
        }
    }
}
