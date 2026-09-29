import java.util.Scanner;

public class SumOfTwoArrayCarry{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array...");
        for (int i = 0; i < n1; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array...");
        for (int i = 0; i < n2; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            arr2[i] = sc.nextInt();
        }

        // Print arrays
        System.out.println("First array is:");
        for (int i = 0; i < n1; i++) {
            System.out.println("Element " + (i + 1) + " : " + arr1[i]);
        }

        System.out.println("Second array is:");
        for (int i = 0; i < n2; i++) {
            System.out.println("Element " + (i + 1) + " : " + arr2[i]);
        }

        // Sum arrays
        int maxSize = Math.max(n1, n2);
        int[] sum = new int[maxSize];

        for (int i = 0; i < maxSize; i++) {
            int x = (i < n1) ? arr1[i] : 0;
            int y = (i < n2) ? arr2[i] : 0;
            sum[i] = x + y;
        }

        // Print sum
        System.out.print("Sum of two arrays: ");
        for (int i = 0; i < maxSize; i++) {
            System.out.print(sum[i] + " ");
        }
        System.out.println();
    }
}