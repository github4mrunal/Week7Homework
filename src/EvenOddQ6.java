//6. Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class EvenOddQ6 {//class
    public static void main(String[] args) {//main method
        EvenOddQ6 eo = new EvenOddQ6();//instance method called
        eo.m2();
        System.out.println();
    }

    void m2() {//instance variable
        int num; // variable defined
        Scanner sc = new Scanner(System.in);//scanner
        System.out.println("Enter a number");//print statement
        num = sc.nextInt();
        if (num % 2 == 0) {//formula
        System.out.println("Odd number");//print statement
    }else
        System.out.println("Even number");
        }










}
