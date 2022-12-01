package com.epam.training.student_anastasiia_chupina.fourth.sum_of_even_numbers;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int[] array = new int[] {1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }

    public static int sum(int[] array){
        int sum = 0;
        if (array != null) {
            for (int arr : array) {
                if (arr%2 == 0) {
                    sum += arr;
                }
            }
        }
        return sum;
    }
}
