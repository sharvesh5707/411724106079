package java.Arrays;
import java.util.Scanner;
public class findingfrequencyofelement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter"+n+"elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to find its frequency:");
        int element = sc.nextInt();
        int count= 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                count++;
            }
        }
        System.out.println("The frequency of " + element + " is: " + count);
    }
}
