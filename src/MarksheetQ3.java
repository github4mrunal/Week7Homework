import java.util.Scanner;

/*3. Write a java program to input student Name,
 roll No, and three subjects Math,
 Science and  English marks (marks is between 0 to 100 and if it is out of range
 print error message “Invalid  Input, Marks should between 0 to 100”)
 and find out total, percentage and result.
 If he is pass or fail on basis of percentage
 (pass>=35) and also give them grade if %> = 80 A+,  %> = 60 A, %> = 50 B, %> = 35 C
 And print Mark Sheet in following format
*/

public class MarksheetQ3 {//class
    public static void main(String[] args) {//main method
    MarksheetQ3 obj = new MarksheetQ3();//object created

        obj.studentResult();//method called using class
    }



    public void studentResult() {//method
        Scanner scan = new Scanner(System.in);//scaneer
        System.out.println("Enter Student Name : ");//print statment
        String name = scan.next();//variable defined
        System.out.println("Enter Student Roll Number Here : ");//print statement
            int rollNmuber = scan.nextInt();//variable defined
        System.out.println("Enter Marks for Maths here : ");//print statement
            int maths = scan.nextInt();//variable defined
        System.out.println("Enter Marks for Science here: ");//print statement
        int science = scan.nextInt();//variable defined
        System.out.println("Enter Marks for English here:  ");//print statement
        int english = scan.nextInt();//variable defined
        int total = maths + science +english;//variable defined
        double percentage =( total * 100) /300;//percentage formula
        String result = null;//variable defined
        String grade = null;// variable defined

         if ( percentage >= 80){ //if else statement
            result = "PASS";
            grade = "A+";
         }else if(percentage>=60 ){
            result="PASS";
            grade= "A";
        }else if(percentage>=50){
            result="PASS";
            grade = "B";
           }else if(percentage>=35) {
             result = "PASS";
             grade = "C";
            } else if(maths< 0 || maths < 100){
                 System.out.println("INVALID INPUT");//print statement
             }else if(science <0 || science<100) {
                 System.out.println("INVALID INPUT");
             }else if(english<0 || english<100){
                 System.out.println("INVALID INPUT");
             } else{
            result="FAIL";
             }

        System.out.println("---------------------------");
        System.out.println("|                          |");
        System.out.println("|       MARKSHEET          |");
        System.out.println("|                          |");
        System.out.println("|--------------------------|");
        System.out.println("|   Name :" +name+ "       |");
        System.out.println("|   Roll No:"+rollNmuber+" |");
        System.out.println("|                          |");
        System.out.println("|Subject: Marks:           |");
        System.out.println("|Maths:"+maths+"           |");
        System.out.println("|Science:"+science+"       |");
        System.out.println("|English:"+english+"       |");
        System.out.println("|                          |");
        System.out.println("|Total:"+total+"           |");
        System.out.println("---------------------------|");
        System.out.println("|Percentage:"+percentage+" |");
        System.out.println("|Result:"+result+"         |");
        System.out.println("|Grade:"+grade+"           |");
        System.out.println("--------------------------");
    }



}
