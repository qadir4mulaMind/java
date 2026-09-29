import java.util.Scanner;

public class Occurence {
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

        System.out.println("The entered elements are:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + " : " + arr[i]);
        }

        System.out.print("Enter target: ");
        int target = input.nextInt();

        int idx = occr(arr, target);
        if (idx != -1) {
            System.out.println("The element " + target + " is found at index " + idx);
        } else {
            System.out.println("Element is not found.");
        }
    }

    public static int occr(int[] a, int t) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == t) return i;
        }
        return -1;
    }
}