import java.util.Scanner;
import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // First array input
        System.out.print("Enter size of first array: ");
        int size1 = input.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr1[i] = input.nextInt();
        }

        // Second array input
        System.out.print("Enter size of second array: ");
        int size2 = input.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr2[i] = input.nextInt();
        }

        // Merge
        int[] merged = mergeArrays(arr1, arr2);
        System.out.println("Merged array: " + Arrays.toString(merged));
    }

    public static int[] mergeArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }

        return result;
    }
}