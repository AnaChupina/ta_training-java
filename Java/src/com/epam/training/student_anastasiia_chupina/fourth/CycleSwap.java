package com.epam.training.student_anastasiia_chupina.fourth;


import java.util.Arrays;

public class CycleSwap {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4};
        CycleSwap.cycleSwap(array, 4);
        System.out.println(Arrays.toString(array));

    }
    static void cycleSwap(int[] array) {
        int [] newArray = new int[array.length];
        if (array.length != 0) {
            newArray[0] = array[array.length-1];
            System.arraycopy(array, 0, newArray, 1, array.length-1);
        }
        System.arraycopy(newArray, 0, array, 0, array.length);
    }

    static void cycleSwap(int[] array, int shift) {
        int [] newArray = new int[array.length];
        for (int i = 0; i<array.length; i++) {
            if ((i + shift)<array.length) {
                newArray[i+shift] = array[i];
            } else {
                newArray[i+shift- array.length] = array[i];
            }
        }
        System.arraycopy(newArray, 0, array, 0, array.length);
    }
}
