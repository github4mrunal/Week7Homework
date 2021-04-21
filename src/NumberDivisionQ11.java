//11. Write a java program to print the numbers between 1 to 100 which can be divided by 3  and 5 separately.

public class NumberDivisionQ11 {
    public static void main(String[] args) {
        NumberDivisionQ11 input = new NumberDivisionQ11();//constructor created
        input.m11();//instance method called
    }

    void m11() {//instance method
        System.out.println("Numbers 1-100 which are divided by 3 & 5");

        System.out.println("Divided by 3: ");
        for (int i = 1; i < 100; i++) {//for Loop
            if (i % 3 == 0)//if else statement
                System.out.print(i + ", ");
        }

        System.out.println("\n\nDivided by 5: ");
        for (int i = 1; i < 100; i++) {//for Loop
            if (i % 5 == 0) System.out.print(i + ", ");//if else statement
        }




    }


}

