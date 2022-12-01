package com.epam.training.student_anastasiia_chupina.third;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);
        int a = Scanner.nextInt();
        int b = Scanner.nextInt();
        int h = Scanner.nextInt();
        int days = 1;
        int rest = h;
        if (a > b) {
            while (rest >= a) {
                days++;
                rest = h-(a-b)*days;
            }
            System.out.println(days);
        } else if (h <= a) {
            System.out.println(days);
        } else {
            System.out.println("Impossible");
        }
    }
}
