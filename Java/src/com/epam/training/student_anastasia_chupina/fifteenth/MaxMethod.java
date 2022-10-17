package com.epam.training.student_anastasia_chupina.fifteenth;

import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        OptionalInt result;
        int max = 0;
        if (values == null || values.length == 0) {
            result = OptionalInt.empty();
            return result;
        }
        for (int i = 0; i < values.length; i++){
            if (i == 0){
                max = values [i];
            }
            if (values[i] > max) {
                max = values [i];
            }
        }
        result = OptionalInt.of(max);
        return result;
    }
}
