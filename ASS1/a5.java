package com.ASS1;
public class a5 {
    public static void main(String[] args) {
        int[][] m1 = {
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] m2 = {
            {12, 11},
            {10, 9},
            {8, 7}
        };
        if (canMultiply(m1, m2)) {
            int[][] result = multiplyMatrices(m1, m2);
            System.out.println("Matrix multi result:");
            printMatrix(result);
        } else {
            System.out.println("Matrix multi is not possible due to incompatible dimensions.");
        }
    }
    public static boolean canMultiply(int[][] m1, int[][] m2) {
        return m1[0].length == m2.length;
    }
    public static int[][] multiplyMatrices(int[][] m1, int[][] m2) {
        int rows = m1.length;
        int cols = m2[0].length;
        int commonDimension = m1[0].length;
        int[][] result = new int[rows][cols];

        for (int a = 0; a < rows; a++) {
            for (int b = 0; b < cols; b++) {
                for (int c = 0; c < commonDimension; c++) {
                    result[a][b] += m1[a][c] * m2[c][b];
                }
            }
        }
        return result;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
