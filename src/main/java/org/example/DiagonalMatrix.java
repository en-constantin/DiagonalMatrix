package org.example;

import java.util.Scanner;

import static java.lang.Math.abs;

public class DiagonalMatrix {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of 'n'
        System.out.print("Enter the value of 'n' (not greater than 100): ");
        int n = scanner.nextInt();
                // Check if n is greater than 100
        if (n > 100) {
            System.out.println("Please enter a value less than or equal to 100.");
            return;
        }
        int[][] matrix = new int[n][n];  // initialization of the matrix
        int i=0;  // this variable will be used to parse the 2D matrix by row
        int j=0;  // this variable will be used to parse the 2D matrix by column

        System.out.println("Example with while:");
        // generating and filling the matrix
        while (i<n){
            while (j<n) {
                matrix[i][j]=abs(i-j);   //using abs predifined function to return the absolute value.
                j++;
            }
            i++;
            j=0;  //setting the j back to 0 for the next row
        }
        i=0;  // setting the i back to 0 for the next While
        // Print the generated matrix
        while (i<n){
            while (j<n){
                System.out.print(matrix[i][j]+ " ");
                j++;
            }
            i++;
            j=0;
            System.out.println();
        }
        i=0;

        System.out.println("example with do while:");
        // generating and filling the matrix
        do{
            do{
              matrix[i][j]=abs(i-j);
              j++;
            }while (j<n);
            i++;
            j=0;
        }while (i<n);
        i=0;
        // Print the generated matrix
        do{
            do{
                System.out.print(matrix[i][j]+" ");
                j++;
            }while (j<n);
            i++;
            j=0;
            System.out.println();
        }while (i<n);

            System.out.println("Example with for:");
        // generating and filling the matrix
         for (i=0; i < n; i++) {
            for (j=0; j < n; j++) {
                matrix[i][j] = (i > j) ? (i - j) : (j - i);  //using ternary operator instead of abs, abs actually is doing the same in background, but it can be done in this way as well
            }
        }
        // Print the generated matrix
        for (i=0; i < n; i++) {    //setting i and j to 0 inside for
            for (j=0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
