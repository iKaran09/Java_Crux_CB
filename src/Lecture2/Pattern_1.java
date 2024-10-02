package Lecture2;

import java.util.Scanner;

class Pattern_1 {
    public static void main(String[] args) {
        System.out.println("Please Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        while (row <= n) {
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            row++;
            System.out.println(" ");
        }

        }
    }
