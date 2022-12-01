package com.epam.training.student_anastasiia_chupina.fourth.sum_of_previous;

import java.util.Arrays;

public class SumOfPrevious {
    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array){
        int sumOfTwoPreviousValues;
        boolean result;
        boolean [] res = new boolean[array.length];
        for (int i = 0; i< array.length; i++) {
            if (i == 0) {
                result = false;
            }else if (i ==1){
                result = false;
            }else {
                sumOfTwoPreviousValues = (array[i-2]+array[i-1]);
                if (sumOfTwoPreviousValues == array[i]){
                    result = true;
                }else {
                    result = false;
                }
            }
            res[i] = result;
        }
        return res;
    }
}
