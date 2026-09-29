import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {
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

        int[] reversed = reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(reversed));
    }

    public static int[] reverseArray(int[] a) {
        int[] rev = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            rev[i] = a[a.length - 1 - i];
        }
        return rev;
    }
}