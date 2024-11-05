import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input string to check palindrome");
        String str=sc.nextLine();
        String reverseString=new StringBuffer(str).reverse().toString();
        if(str.equals(reverseString))
        System.out.println("String is palindrome");
        else
        System.out.println("string is not palindrome");

    }
}
