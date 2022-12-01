package com.epam.training.student_anastasiia_chupina.third;

import java.util.Locale;
import java.util.Scanner;


public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = Math.pow(b, 2) - 4*a*c;
        double x1 = (- b - Math.sqrt(discriminant))/(2*a);
        double x2 = (- b + Math.sqrt(discriminant))/(2*a);
        if (discriminant >= 0) {
            if (discriminant > 0) {
                if (x1<x2) {
                    System.out.println(x1 + " " + x2);
                } else {
                    System.out.println(x2 + " " + x1);
                }
            } else {
                System.out.println(x1);
            }
        } else {
            System.out.println("no roots");
        }
    }
}
