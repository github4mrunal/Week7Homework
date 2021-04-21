//5.WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross  salary
//HRA = basic salary 10%
//        DA = Basic salary 8%
//        TA = Basic salary 9%
//        PF= Basic salary 20%
//        Gross salary = basic salary + HRA + TA + DA –PF
//        Print in following format
//        _______________________________
//        | Salary Slip |
//        |______________________________|
//        | Employee Id : 2564 |
//        | Employee Name : Jay |
//        |______________________________|
//        | Basic Salary : 25000.0 |
//        | HRA 10% : 2500.0 |
//        | TA 8% : 2250.0 |
//        | DA 9% : 2000.0 |
//        | PF - 20& : 5000.0 |
//        |______________________________|
//        | Gross Salary : 26750.0 |
//        |===========================|



import java.util.Scanner;

public class WapQ5 {//class name
    public static void main(String[] args) {//main method
        WapQ5 obj = new WapQ5();//object creation
        obj.salaryGross();//object called
    }

    void salaryGross() {//instance method
        Scanner scan = new Scanner(System.in);//Scanner
        System.out.println("Enter Basic Salary Here : ");
        long basicSalary;//variable defined
        basicSalary = scan.nextLong();//variable defined
        double hra = 0, ta = 0, da = 0, pf = 0, grossSalary;//variable defined
        System.out.println("Enter Employee Name here :");//print statement
        String employeeName = scan.next();//variable defined
        System.out.println("Enter Employee Id here: ");//print statement
        int employeeId = scan.nextInt();//int statement

        hra = (basicSalary * 10) / 100;
        da = (basicSalary * 8) / 100;
        ta = (basicSalary * 9) / 100;
        pf = (basicSalary * 20) / 100;
        grossSalary = ((basicSalary + hra + da + ta) - (pf));//formula
        System.out.println("-----------------------------------");//print statement
        System.out.println("|Salary Slip                       |");
        System.out.println("|----------------------------------|");
        System.out.println("|Employee Id:" + employeeId + "        |");
        System.out.println("|Employee Name:" + employeeName + "    |");
        System.out.println("|----------------------------------|");
        System.out.println("|Basic Salary " + basicSalary + "    |");
        System.out.println("|HRA " + hra + "                      ");
        System.out.println("|DA " + da + "                        ");
        System.out.println("|TA " + ta + "                         ");
        System.out.println("|PF " + pf + "                         ");
        System.out.println("|----------------------------------|");
        System.out.println("|GROSS SALARY " + grossSalary + "      ");
        System.out.println("|==================================|");

    }
}













