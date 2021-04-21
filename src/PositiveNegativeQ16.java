//16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO”

import java.util.Scanner;

public class PositiveNegativeQ16 {
    public static void main(String[] args) {//main method
        PositiveNegativeQ16 obj = new PositiveNegativeQ16();//constructor
        obj.m16();//method called
    }

    void m16(){
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check");
        number = scan.nextInt();


        if (number > 0){//if else statement
            System.out.println("This is a positive number");
        }
else if (number <0){
            System.out.println("This is a negative number");
        }
else{
            System.out.println("This is a Zero");
        }
    }




}
