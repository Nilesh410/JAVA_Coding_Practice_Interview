import java.util.Scanner;

public class ReverseString
{
   public static void main(String[] args) {
      System.out.println("Enter the string for reverse");
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      StringBuffer inputString= new StringBuffer(str);
      System.out.println("Input String="+str);
      System.out.println("Reverse String="+inputString.reverse());

   }
}