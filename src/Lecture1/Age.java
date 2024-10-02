package Lecture1;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        System.out.println("Please Enter you Age and check you are eligible for voting or not:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18)
        {
            System.out.println("You are eligible!");
        }
        else {
            System.out.println("You are not eligible, sorry!");
        }
    }
}
