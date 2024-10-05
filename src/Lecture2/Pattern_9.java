package Lecture2;

import java.util.Scanner;

public class Pattern_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        //always remember the basics of loops
        //here we are using the while loop.
        //loops always needed three main components w
        int space = n - 1;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }

            System.out.println();
            space--;
            row++;
            star += 2;
        }
    }
}
