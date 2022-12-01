package com.epam.training.student_anastasiia_chupina.fourth;

import java.util.Arrays;

public class LocalMaximaRemove {
    public static void main(String[] args) {
        int[] array = new int[]{-18, 21, 0, 6, 7, 65};
        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){
        int [] arr = new int[array.length];
        int j = 0;
        int length = 0;
        for (int i=0; i< array.length; i++) {
            if (i == 0) {
                if (array[i]<=array[i+1]) {
                    arr[j] = array[i];
                    length++;
                } else {
                    j--;
                }
            }else if (i == array.length-1) {
                if (array[i]<=array[i-1]) {
                    arr[j] = array[i];
                    length++;
                }else {
                    j--;
                }
            }else if (array[i]<=array[i-1] || array[i]<=array[i+1]) {
                arr[j] = array[i];
                length++;
            }else {
                j--;
            }
            j++;
        }

        int[] newArr = Arrays.copyOf(arr, length);
        return newArr;
    }
}
