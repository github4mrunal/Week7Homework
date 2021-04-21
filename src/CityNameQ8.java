import java.util.Scanner;

//8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
// if  any other alphabet should be invalid entry
//
 public class CityNameQ8 {//class
    public static void main(String[] args) {//main method
        CityNameQ8 obj = new CityNameQ8();//class called using object
        obj.m8();//method calling
    }

    void m8(){//instance variable
        String name;// variable defined
        Scanner ct = new Scanner(System.in);//Scanner object
        System.out.println("Enter the Alphabet for City:");//print statement
        name = ct.nextLine(); // element

        if (name.equals("A")){//if else statement
            System.out.println("Amershan");
        }
        else if (name.equals("B")){
            System.out.println("Birminghan");
        }
        else if (name.equals("C")){
            System.out.println("Chesham");
        }
        else if (name.equals("D")){
            System.out.println("Doncaster");
        }
        else if (name.equals("E")){
            System.out.println("Edinburgh" );
        }
        else if (name.equals("F")){
            System.out.println("Folkstone");
        }
        else
            System.out.println("Invalid Entry");
    }
}
