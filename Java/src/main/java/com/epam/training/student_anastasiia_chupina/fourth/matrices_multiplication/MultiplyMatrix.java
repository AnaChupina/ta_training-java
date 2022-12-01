package com.epam.training.student_anastasiia_chupina.fourth.matrices_multiplication;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int [][] res = new int[matrix1.length][matrix2[0].length];
        int n; //number of columns in first matrix
        int m; //number of rows in the second matrix
        int i;
        int j;
        int sum = 0;
        for (i = 0; i < matrix1.length;  i++) {
            for (j = 0; j < matrix2[0].length; j++){
                for (n = 0, m = 0; n < matrix1[0].length; n++, m++) {
                    sum += matrix1[i][n]*matrix2[m][j];
                }
                res [i][j] = sum;
                sum = 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567} };

        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6} };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
