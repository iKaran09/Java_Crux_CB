package Lecture1;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Please enter the number to check is it even or odd:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0)
        {
            System.out.println("This is an Even number");
        }
        else {
            System.out.println("This is a odd number");
        }
    }
}
