package Lecture1;

public class Inc_Dec {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        System.out.println(a++); //post increment
        System.out.println(a);
        System.out.println(++a); //pre increment
        System.out.println(a);

        System.out.println("--------------");

        int b = 20;
        System.out.println(b);
        System.out.println(b--); //post decrement
        System.out.println(b);
        System.out.println(--b); //pre decrement
        System.out.println(b);
    }
}
