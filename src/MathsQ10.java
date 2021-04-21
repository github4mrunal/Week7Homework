//10.Write a java program to input any two number and ask user to enter their symbol (+, -,  /, *)
// find addition, Subtraction, multiplication and division according to their symbol  (using if else)

import java.util.Scanner;

public class MathsQ10 {

    public static void main(String[] args) {

        MathsQ10 obj = new MathsQ10();//constructor created
        obj.m10();
    }

    void m10() {//instance method
        Scanner input = new Scanner(System.in);
        int num1, num2, ans;//variable defined
        char sign;

        System.out.print("Please Enter your first digit: ");

        num1 = input.nextInt();//variable defined

        System.out.print("Enter the second digit: ");
        num2 = input.nextInt();


        System.out.print("Enter the mathematical operator to be used: ");
        sign = input.next().charAt(0);
        if (sign == '+') {//if else statement
            ans = num1 + num2;
            System.out.println(num1 + " " + sign + " " + num2 + " = " + " " + ans);
        } else if (sign == '-') {
            ans = num1 - num2;
            System.out.println(num1 + " " + sign + " " + num2 + " = " + " " + ans);
        } else if (sign == '/') {
            ans = num1 / num2;
            System.out.println(num1 + " " + sign + " " + num2 + " = " + " " + ans);
        } else if (sign == '*') {
            ans = num1 * num2;
            System.out.println(num1 + " " + sign + " " + num2 + " = " + " " + ans);
        } else

            System.out.println("Your Input is not correct");

    }


}

