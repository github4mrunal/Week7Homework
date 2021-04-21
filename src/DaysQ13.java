import java.util.Scanner;

/*
13. Write a Java program which input any number between 1 to 7 and it print The Days  name MONDAY, TUESDAY…..SUNDAY
 of the week accordingly by using switch.
NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class DaysQ13 {
    public static void main(String[] args) {
        DaysQ13 obj = new DaysQ13();//constructor created
        obj.m13();//method called
    }

    void m13(){
        Scanner sc = new Scanner(System.in);
        int day;
        System.out.println("The Days Name: ");
        day = sc.nextInt();
        switch (day){//switch method

            case 1 :
                System.out.println("First day is Monday");
                break;
            case 2 :
                System.out.println("Second day is Tuesday");
                break;
            case 3 :
                System.out.println("Third day is Wednesday");
                break;
            case 4:
                System.out.println("Forth day is Thrusday");
                break;
            case 5:
                System.out.println("Fifth day is Friday");
                break;
            case 6:
                System.out.println("Sixth day is Saturday");
                break;
                case 7:
                System.out.println("Seventh day is Sunday");
            break;

            default:// default statement
                System.out.println("Week contains 1 to 7 days");
        }

    }
}









