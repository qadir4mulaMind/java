package Array;

import java.util.Scanner;

public class RotateArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("...............................");
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter " + (i + 1) + " element: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The entered elements of array are:");
        for (int i = 0; i < n; i++) System.out.println("Element " + (i + 1) + " of Array is: " + arr[i]);
    }
}