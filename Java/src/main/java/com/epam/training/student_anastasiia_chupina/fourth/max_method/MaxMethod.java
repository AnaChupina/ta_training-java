package com.epam.training.student_anastasiia_chupina.fourth.max_method;

public class MaxMethod {
    public static int max(int[] values) {
        //throw new UnsupportedOperationException();
        int max = values[0];
        for (int value : values){
            if (max < value) {
               max = value;
            }
        }
        return max;
    }
}