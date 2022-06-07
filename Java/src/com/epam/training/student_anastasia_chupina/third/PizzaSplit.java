package com.epam.training.student_anastasia_chupina.third;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people = scan.nextInt();
        int pieces = scan.nextInt();
        int counter = 1;
        int extra = (pieces*counter)%people;
        while (extra != 0) {
            counter++;
            extra = (pieces*counter)%people;
        }
        System.out.println(counter);
    }
}
