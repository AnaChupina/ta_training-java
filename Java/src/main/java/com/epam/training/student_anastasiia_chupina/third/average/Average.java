package com.epam.training.student_anastasiia_chupina.third.average;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = input;
        int counter = 1;
        while (input != 0) {
            input = scanner.nextInt();
            if (input != 0) {
                counter++;
                sum = (sum + input);
            }
        }
        int average = (int) Math.round(sum/counter);
        System.out.println(average);
    }
}
