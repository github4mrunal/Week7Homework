//19. Write a Java program to calculate the average value of array
public class ArrayAvgQ19 {
    public static void main(String[] args) {
        ArrayAvgQ19 obj = new ArrayAvgQ19();//constructor defined
        obj.m19();
    }

    void m19(){
        int a[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};//arrays defined

        int avg = 0;//variable defined

        for (int i : a)//loop

            avg += i/10;
        System.out.println("The average value is " +avg );
    }

}
