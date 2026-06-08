package java.Arrays;
// dynamic array is a data structure that can grow and shrink in size dynamically. In Java, we can use the ArrayList class from the java.util package to create a dynamic array. However, in this example, we will demonstrate how to create a dynamic array using a regular array and resizing it when needed.
import java.util.Scanner;
public class dynamicarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The "+i+" index element in the array is: " + arr[i]);
        }
        sc.close();
    }
    
}
