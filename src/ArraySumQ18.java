//18. Write a Java program to sum values of an array.

import java.util.Arrays;

public class ArraySumQ18 {
    public static void main(String[] args) {
        ArraySumQ18 obj = new ArraySumQ18();
        obj.m18();
    }

    void m18(){//instance method

         int a[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};//array defined
                int sum = 0;

                for (int i : a)//for loop
                    sum += i;
                System.out.println("The sum is " + sum);//print statement
            }



}
