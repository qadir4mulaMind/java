import java.util.Scanner;

public class ArrayUtility {
        public static final Scanner input = new Scanner(System.in);

        public static void inputArray(int[] a, int i) {
                if (i < 0) return;
                inputArray(a, i - 1);
                System.out.print("Enter element " + (i + 1) + ": ");
                a[i] = input.nextInt();
        }

        public static void printArray(int[] a, int i) {
                if (i >= a.length) return;
                System.out.println("Element " + (i + 1) + " is: " + a[i]);
                printArray(a, i + 1); // fix: previously missing i + 1
        }
}