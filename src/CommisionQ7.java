/*7. Write a java program input sales id, seller's name, sales amount, and salary basic and then find this sales
Commission Sales amount >= 50,000 35% Sales amount >= 30,000 20% >= 20,000 10% >= 10,000 5% < 10,000 2%*/

import java.util.Scanner;

public class CommisionQ7 {//class name
    public static void main(String[] args) {//main method
        CommisionQ7 obj = new CommisionQ7();//object created
        obj.m1();
    }

void m1() {//instance method
        Scanner input = new Scanner(System.in);//scanner class
   System.out.println("Salesid : 01");// print statement
    System.out.println("Salesman Name : Prime");
     System.out.println("Salary is 25,000");
    double Commision;//variable defined
    double CommisionRate;//variable defined
    double Salesamount;//variable defined
    System.out.println("Enter your Sales Amount:");
CommisionRate = input.nextDouble();//mismatch exception
Salesamount = input.nextDouble();



    if (Salesamount >= 50000){// if else statement
    CommisionRate = 35;

    } else if (Salesamount >=30000){
        CommisionRate = 20;
    }
    else if (Salesamount >= 20000){
        CommisionRate = 10;
    }
    else if (Salesamount>= 1000){
        CommisionRate = 5;

    }
    else {
        CommisionRate = 2;
    }
    Commision = CommisionRate * Salesamount / 100;
    System.out.println("Your Commision is " +Commision);
    }
}
