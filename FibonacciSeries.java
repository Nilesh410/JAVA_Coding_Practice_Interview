import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num1=0,num2=1;
        int result=0;
        System.out.println("Enter the number up to that show fibonacci series");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("fibonacci Series:");
        System.out.print(num1+" "+num2);
        for(int n=2;n<num;n++)
        {
            result=num1+num2;
            System.out.print(" "+result);
            num1=num2;
            num2=result;
        }
    }
}
