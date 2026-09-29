import java.util.Scanner;
import java.util.Arrays;

public class DeleteElementArray {
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

        System.out.print("Enter element to delete: ");
        int target = input.nextInt();

        int[] newArr = deleteElement(arr, target);

        if (newArr.length == arr.length) {
            System.out.println("Element not found. No deletion done.");
        } else {
            System.out.println("New array after deleting " + target + " : " + Arrays.toString(newArr));
        }
    }

    public static int[] deleteElement(int[] a, int target) {
        int index = -1;

        // Find index of target
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                index = i;
                break;
            }
        }

        // If not found, return same array
        if (index == -1) {
            return a;
        }

        // Create new array with one less size
        int[] result = new int[a.length - 1];

        for (int i = 0, j = 0; i < a.length; i++) {
            if (i == index) continue;
            result[j++] = a[i];
        }

        return result;
    }
}