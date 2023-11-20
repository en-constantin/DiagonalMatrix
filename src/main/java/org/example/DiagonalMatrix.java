package org.example;

import java.util.Scanner;

import static org.example.DoWhileLoopMatrixGenerator.generateAndPrintMatrixWithDoWhileLoop;
import static org.example.ForLoopMatrixGenerator.generateAndPrintMatrixWithForLoop;
import static org.example.WhileLoopMatrixGenerator.generateAndPrintMatrixWithWhileLoop;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of 'n' (not greater than 100): ");
        int n = scanner.nextInt();
        while (n > 100) {
            System.out.print("Please enter a value less than or equal to 100:");
            n = scanner.nextInt();
        }
        System.out.println("Example with while loop:");
        generateAndPrintMatrixWithWhileLoop(n);

        System.out.println("Example with do-while loop:");
        generateAndPrintMatrixWithDoWhileLoop(n);

        System.out.println("Example with for loop:");
        generateAndPrintMatrixWithForLoop(n);
    }
}