package java.javaprobelms;
import java.util.Scanner;
public class ispalindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        int rev=0;
        int temp=n;
        while(n>0)
        {
            int x=n%10;
            rev=rev*10+x;
            n=n/10;
        }
        if(temp==rev)
        {
            System.out.println("The number is palindrome");
        }
        else
        {
            System.out.println("The number is not palindrome");
        }
        sc.close();
    }

    
}
