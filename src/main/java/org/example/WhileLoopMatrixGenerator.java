package org.example;

import static java.lang.Math.abs;

public class WhileLoopMatrixGenerator {
    public static void generateAndPrintMatrixWithWhileLoop(int n) {
        int[][] matrix = generateMatrixWithWhileLoop(n);
        printMatrix(matrix);
    }

    private static int[][] generateMatrixWithWhileLoop(int n) {
        int[][] matrix = new int[n][n];
        int i = 0;
        int j = 0;
        // generating and filling the matrix
        while (i < n) {
            while (j < n) {
                matrix[i][j] = abs(i - j);
                j++;
            }
            i++;
            j = 0;
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        int i = 0;
        int j = 0;

        // Print the generated matrix
        while (i < matrix.length) {
            while (j < matrix[i].length) {
                System.out.print(matrix[i][j] + " ");
                j++;
            }
            i++;
            j = 0;
            System.out.println();
        }
    }
}