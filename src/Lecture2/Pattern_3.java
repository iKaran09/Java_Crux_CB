package Lecture2;

import java.util.Scanner;

class Pattern_3 {
    public static void main(String[] args) {
        System.out.println("Please Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = n;
        while (row >= 1) {
            int i = 1;
            while (i <= row) {
                System.out.print("* ");
                i++;
            }
            row--;
            System.out.println();
        }
        }
    }

