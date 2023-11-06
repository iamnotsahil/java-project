import java.util.Arrays;

public class Sda17 {
    public static int getSecondLargest(int[] a, int total) {
        Arrays.sort(a);
        return a[total - 2];
    }

    public static void main(String args[]) {
        int a[] = {1, 2, 5, 6, 3, 2};
        System.out.println("Second largest number: " + getSecondLargest(a, 6));
    }
}
