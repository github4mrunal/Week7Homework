//2. Write a java program to input any year like (ex.2007)
// and find out if it is leap year or  not?

import java.util.Scanner;//Java package
public class LeapYearQ2 {//class name
    public static void main(String[] args) {//main method
        LeapYearQ2 obj = new LeapYearQ2(); //object created
        obj.m1();//method called using object
    }

     void m1(){//instance method
        int year;//variable
        System.out.println("Enter an Year : ");//print statement
        Scanner sc = new Scanner(System.in);//scanner object
        year = sc.nextInt();// variable defined

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))//formula for leap year using if and else statement
           System.out.println("This year is a leap year");// print statement
        else
            System.out.println("This year is not a leap year");//print statement
    }
}















