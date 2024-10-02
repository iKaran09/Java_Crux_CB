package Lecture1;

import java.util.Scanner;

public class GradeCard {
    public static void main(String[] args) {
        System.out.println("Please Enter you total marks:");
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        if (mark>=75){
            System.out.println("Congratulations! A Grade");
        }
        else if (mark>=65){
            System.out.println("Congratulations! B Grade");
        } else if (mark >= 55) {
            System.out.println("Congratulations! C Grade");
        } else if (mark >= 45) {
            System.out.println("Congratulations! D Grade");
        }
        else {
            System.out.println("Sorry! You are fail");
        }

    }
}
