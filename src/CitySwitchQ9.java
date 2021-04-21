//Q9 Same as Q8 using switch

import java.util.Scanner;

public class CitySwitchQ9 {//class name
    public static void main(String[] args) {//main method
        CitySwitchQ9 cs = new CitySwitchQ9();//object created
        cs.m9();//method calling
    }

    void m9() {//instance variable
        int City;//variable defined
        Scanner cs = new Scanner(System.in);//Scanner object created
        System.out.println("Enter city code:");//print statement

        City = cs.nextInt();//variable defined with scanner

        switch (City) {//switch method
            case 1:
                System.out.println("Ahmedabad");
                break;
            case 2:
                System.out.println("Baroda");
                break;
            case 3:
                System.out.println("Chikli");
                break;
            case 4:
                System.out.println("Dakor");
                break;
            case 5:
                System.out.println("Egola");
                break;
            case 6:
                System.out.println("Fatehpur");
                break;
            default:
                System.out.println("Invalid entry");//print statement

        }

    }
}
