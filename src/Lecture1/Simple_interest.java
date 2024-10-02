package Lecture1;

import java.util.*;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the principle amount:");
        int p = sc.nextInt();
        System.out.println("Please enter the rate of interest:");
        int r = sc.nextInt();
        System.out.println("Please enter the time:");
        int t = sc.nextInt();
        System.out.println("The simple on your amount it will be:");
        int si = (p * r * t)/100;
        System.out.println(si);
    }
}
