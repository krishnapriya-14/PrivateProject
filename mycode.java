
import java.util.*;

public class SecondLargest {
    private static OptionalInt secondLargest(int[] arr) {
        if (arr == null || arr.length < 2) return OptionalInt.empty();

        Integer max = null, second = null;
        for (int x : arr) {
            if (max == null || x > max) {
                second = max;
                max = x;
            } else if (x != max && (second == null || x > second)) {
                second = x;
            }
        }
        return (second == null) ? OptionalInt.empty() : OptionalInt.of(second);
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        OptionalInt result = secondLargest(arr);
        if (result.isPresent()) {
            System.out.println("Second largest: " + result.getAsInt());
        } else {
            System.out.println("No second largest element.");
        }
    }
}
EOF
