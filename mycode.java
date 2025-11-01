import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        Arrays.sort(arr);
        int n = arr.length;
        if (n < 2) {
            System.out.println("No second largest element.");
            return;
        }
        int largest = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                System.out.println("Second largest: " + arr[i]);
                return;
            }
        }
        System.out.println("No second largest element.");
    }
}
