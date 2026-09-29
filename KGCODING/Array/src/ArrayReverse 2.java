import java.util.Scanner;
import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements of array...");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }

        reverseInPlace(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    public static void reverseInPlace(int[] a) {
        int start = 0;
        int end = a.length - 1;

        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }
    }
}