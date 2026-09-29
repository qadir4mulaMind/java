package Array;

import java.util.Scanner;

public class printNegative
{
    public static void printNegative(int[] a)
    {
        for (int x : a)
        {
            if (x < 0)
            {
                System.out.println(x + " ");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("...............................");
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter element: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The elements of array...........");
        for (int i = 0; i < n; i++)
        {
            System.out.println("Element of array: " + arr[i]);
        }
        System.out.println("the negative element of array...........");
        printNegative(arr);
    }
}