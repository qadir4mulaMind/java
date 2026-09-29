package Array;

import java.util.Scanner;

import java.util.Scanner;

public class TwoSum {
    public static int[] sumTwo(int[] a, int target) {
        int n = a.length;
        int[] index = {-1, -1};
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] + a[j] == target) {
                    index[0] = i;
                    index[1] = j;
                    return index; // Found pair, return immediately
                }
            }
        }
        return index; // If no pair found
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("...............................");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The enterd element of array are.....");
        for(int i = 0; i < n; i++) System.out.println("Element " + (i + 1) + " of Array is: " + arr[i]);
        System.out.print("Enter target: ");
        int target = input.nextInt();

        int[] t = sumTwo(arr, target);

        if (t[0] != -1) {
            System.out.println("Target is found at index " + t[0] + " and " + t[1]);
        } else {
            System.out.println("No two elements add up to the target.");
        }
    }
}