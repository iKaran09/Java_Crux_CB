package Lecture1;


import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        System.out.println("Please Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        for (i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
