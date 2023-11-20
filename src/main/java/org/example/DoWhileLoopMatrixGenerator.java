package org.example;

import static java.lang.Math.abs;

public class DoWhileLoopMatrixGenerator {
    public static void generateAndPrintMatrixWithDoWhileLoop(int n) {
        int[][] matrix = generateMatrixWithDoWhileLoop(n);
        printMatrix(matrix);
    }

    private static int[][] generateMatrixWithDoWhileLoop(int n) {
        int i = 0;
        int j = 0;
        int[][] matrix = new int[n][n];
        // generating and filling the matrix
        do {
            do {
                matrix[i][j] = abs(i - j);
                j++;
            } while (j < n);
            i++;
            j = 0;
        } while (i < n);
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = (rows > 0) ? matrix[0].length : 0;

        if (rows != cols) {
            throw new IllegalArgumentException("Provided matrix is not square.");
        }
        int i = 0;
        int j = 0;

        do {
            do {
                System.out.print(matrix[i][j] + " ");
                j++;
            } while (j < cols);
            i++;
            j = 0;
            System.out.println();
        } while (i < rows);
    }
}
