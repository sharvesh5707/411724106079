package java.javaprobelms;
import java.util.Scanner;
public class isarmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = digit * digit * digit;
            n /= 10;
        }
        if (temp == sum) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
        sc.close();
    }
}
