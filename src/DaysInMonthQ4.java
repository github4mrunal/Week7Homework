//4. Number of Days In Month

import java.util.Scanner;

public class DaysInMonthQ4 {
    public static void main(String[] args) {
        isLeapYear(2020);
        getDaysInMonth(2, 2020); //both static methods called in main method direct

    }

    //isleapyear method with parameters

    static boolean isLeapYear(int year) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year here:");
        year = scan.nextInt();

        boolean resultLy;


        if ((year < 1 && year > 9999) && (year % 4 == 0 && year % 100 != 0) || year % 400 != 0) {
            resultLy = true;
            System.out.println("This is a Leap year");

        } else {
            resultLy = false;
            System.out.println("This is not aLeap year");
        }
        return resultLy;
    }
    //getdaysinmoth method with parameters

    static int getDaysInMonth(int month, int year) {
        boolean a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Month");
        month = scan.nextInt();
        // year = scan.nextInt();
        int days = 0;

        //if else method
        if ((month < 1 || month > 12 || year < 1 || year > 9999)) {
            days = -1;
            System.out.println("-1");
        } else {
            switch (month) {   //switch statement
                case 1:
                    days = 31;
                    System.out.println("January-31 days");
                    break;
                case 2:
                    //isLeapYear( year );
                    if (isLeapYear(year)) {
                        days = 29;
                        System.out.println("February-29 days as it is a leapyear");   //february month if leap year
                        break;
                    } else {
                        days = 28;
                        System.out.println("February-28 days as it is not a leap year"); //february month if not a leap year
                        break;
                    }
                case 3:
                    days = 31;
                    System.out.println("March -31 days");
                    break;
                case 4:
                    System.out.println("April-30 days");
                    break;
                case 5:
                    System.out.println("May -31 days");
                    break;
                case 6:
                    System.out.println("June - 30 days");
                    break;
                case 7:
                    System.out.println("July-0 31 days");
                    break;
                case 8:
                    System.out.println("August-31 days");
                    break;
                case 9:
                    System.out.println("September-30 days");
                    break;
                case 10:
                    System.out.println("October-31 days");
                    break;
                case 11:
                    System.out.println("November-30 days");
                    break;
                case 12:
                    System.out.println("December-31 days");
                    break;
                default:
                    System.out.println("-1");


            }
        }

        return days;
    }


}