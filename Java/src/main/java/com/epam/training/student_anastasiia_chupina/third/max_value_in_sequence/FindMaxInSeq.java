package com.epam.training.student_anastasiia_chupina.third.max_value_in_sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner Scanner = new Scanner(System.in);
        int input = Scanner.nextInt();
        int maximum = input;
        while (input != 0) {
            input = Scanner.nextInt();
            if (input != 0) {
                maximum = Math.max(maximum, input);
            }
        }
        return maximum;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }

}
