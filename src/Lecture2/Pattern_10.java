package Lecture2;

import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Reading the number of rows

        int star = 2 * n - 1;  // Initial number of stars (odd numbers like 9, 7, 5, ...)
        int space = 0;         // Initial number of spaces
        int row = 1;           // Initialisation of row loop - Starting from the first row

        // Outer loop to control the rows
        while (row <= n) {

            // Inner loop to print spaces
            int i = 0;
            while (i < space) {
                System.out.print(" ");
                i++;
            }

            // Inner loop to print stars
            int j = 0;
            while (j < star) {
                System.out.print("*");
                j++;
            }

            // Move to the next line after printing the current row
            System.out.println();
            // Decrease the number of stars by 2 for the next row
            star -= 2;
            // Increase the number of spaces by 1 for the next row
            space++;
            // Move to the next row
            row++;
        }

        sc.close();
    }
}
