package org.example;

public class ForLoopMatrixGenerator {
    public static void generateAndPrintMatrixWithForLoop(int n) {
        int[][] matrix = generateMatrixWithForLoop(n);
        printMatrix(matrix);
    }

    private static int[][] generateMatrixWithForLoop(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (i > j) ? (i - j) : (j - i);
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        // Print the generated matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}