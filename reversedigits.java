package java.javaprobelms;
import java.util.Scanner;
public class reversedigits {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        int rev=0;
        while(n>0)
        {
            int x=n%10;
            rev=rev*10+x;
            n=n/10;
        }
        System.out.println("Reversed number is "+rev);
        sc.close();
    }
}
