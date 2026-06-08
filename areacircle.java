package javaintro;
import java.util.Scanner;
public class areacircle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius");
        double r = sc.nextDouble();
        double area = 3.14*r*r;
        System.out.println(area);
}
}   
