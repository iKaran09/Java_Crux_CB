package Lecture1;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        System.out.println("Enter three numbers A, B, C:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>=b && a>=c) {
            System.out.println("A is The largest number");
        } else if (b >= a && b >= c) {
            System.out.println("B is The largest number");
        }
        else {
            System.out.println("C is The largest number");
        }
    }
}
