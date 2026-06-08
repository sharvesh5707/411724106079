package java.Arrays;
// Static arrays are arrays whose size is determined at compile time and cannot be changed during runtime. In Java, we can declare and initialize static arrays as follows:
public class staticarray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
