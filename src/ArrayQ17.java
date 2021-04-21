//17. Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class ArrayQ17 {
    public static void main(String[] args) {
        ArrayQ17 obj = new ArrayQ17();
        obj.m17();

    }

    void m17(){
        int [] num = {10,12,14,16,18,20};//array
        Arrays.sort(num);//array sort statement
        String [] name = {"This", "Is", "Prime", "Testing"};
        Arrays.sort(name);
        System.out.println(Arrays.toString(num));//print statement
        System.out.println(Arrays.toString(name));// print statment
    }



}
