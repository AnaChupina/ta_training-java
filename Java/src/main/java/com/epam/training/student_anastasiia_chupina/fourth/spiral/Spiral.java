package com.epam.training.student_anastasiia_chupina.fourth.spiral;

public class Spiral {
    public static void main(String[] args) {
        int [][] spiral = Spiral.spiral(2,1);
        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(String.format("%4s", spiral[i][j]));
            }
            System.out.println();
        }
    }
    static int [][] spiral(int rows, int columns) {
        int[][] spiral = new int[rows][columns];
        int r = 0;
        int c = 0;
        int value = 1;
        while (r < rows && c < columns) {
            for (int i = c; i < columns; ++i) {
                spiral[r][i] = value++;
            }
            r++;
            for (int i = r; i<rows; ++i) {
                spiral[i][columns-1] = value++;
            }
            columns--;
            if (r<rows) {
                for (int i = columns-1; i>=c; --i) {
                    spiral[rows-1][i] = value++;
                }
                rows--;
            }
            if (c<columns) {
                for (int i = rows - 1; i>=r; --i) {
                    spiral[i][c] = value++;
                }
                c++;
            }
        }
        return spiral;
    }
}
