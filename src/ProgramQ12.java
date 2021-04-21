import java.util.Scanner;

//12. Write a program that tells us input value is number or an alphabet or symbol.
public class ProgramQ12 {
    public static void main(String[] args) {//main method
        ProgramQ12 obj = new ProgramQ12();//constructor created
        obj.m12();//object created
    }

    void m12(){//instance method
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter any character:");
        char ch = abc.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch<= 'Z'))//if else statement
        {
            System.out.println("This is a Alphabet" );
        }
        else if (ch >= '0' && ch <= '9')
        {
            System.out.println("This is a Number" );
        }
        else{
            System.out.println("This is a symbol" );
        }


    }

}
