import java.util.Scanner;

public class SumAverage {
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

        int sum = addition(arr);
        double average = avg(arr);

        System.out.println("The sum of array is " + sum + " and average is " + average);
    }

    public static int addition(int[] a) {
        int sum = 0;
        for (int value : a) {
            sum += value;
        }
        return sum;
    }

    public static double avg(int[] a) {
        int sum = addition(a);
        return (double) sum / a.length;
    }
}