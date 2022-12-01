package com.epam.training.student_anastasiia_chupina.fourth;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int [][] transp = new int[matrix[0].length][matrix.length];
        //замена строк на столбцы
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[0].length; c++) {
                    transp[c][r] = matrix[r][c];
                }
            }
        return transp;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] matrix = {
                {1, 2, 5} ,
                {-13, 7, 8}
                };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
