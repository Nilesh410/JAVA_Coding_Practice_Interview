import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number to find factorial");
        Scanner sc=new Scanner(System.in);
        int num,result=1;
        while(true)
        { 
            if(!sc.hasNextInt())
            {
                System.out.println("Invalid Input");
                System.out.println("Enter the proper number");
                num=sc.nextInt();  
            }
            else
              num=sc.nextInt();
              break;
        }
        
        for(int i=1;i<=num;i++)
        {
            result=result*i;
        }
        System.out.println("factorial of number="+result);
    }
}
