import java.util.Scanner;

//1. Write a java program that tells us that Input number is odd or even?
// HINT: use ternary operator (? :)
public class OddEvenQ1 {//class
    public static void main(String[] args) {//main method
        m1();//static method calling




    }
    static void m1(){//Static method
        Scanner scan = new Scanner(System.in);//scanner object called

        System.out.println("Enter number to check");//print statement
        int number = scan.nextInt();//variable define
        scan.close();//scanner close

        //ternary operator to check number
        String result = number % 2 == 0 ? "Even" : "Odd";

        System.out.println(number + " is " + result);//print statement


    }


}