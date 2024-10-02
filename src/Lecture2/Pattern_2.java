package Lecture2;

import java.util.Scanner;

class Pattern_2 {
    public static void main(String[] args) {
        System.out.println("Please Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        while (row <= n) {
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            star++;
            row++;
            System.out.println(" ");
        }
    }
}
