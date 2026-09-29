import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Please enter the elements of array...");
        ArrayUtility.inputArray(arr, size - 1);

        System.out.println("The entered elements are...");
        ArrayUtility.printArray(arr, 0); // Start from 0 instead of size-1

        System.out.println("The sum of all the positive elements is " + sumPositive(arr));
    }

    public static int sumPositive(int[] a) {
        int sum = 0;
        for (int val : a) {
            if (val >= 0) {
                sum += val;
            }
        }
        return sum;
    }
}