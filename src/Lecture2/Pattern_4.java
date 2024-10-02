package Lecture2;

import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args) {
        System.out.println("Please enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int row = 1;
        int star = 1;
        int space = n - 1;
        while (row <= n) {
            int i = 1;
            //space
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            //star
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }

            //next row preparation
            row++;
            System.out.println();
            space--;
            star++;
        }
    }
}
