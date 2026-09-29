package Array;

import java.util.Scanner;

public class PassingArrayToMethod
{
    public static void change(int[] a)
    {
        a[0] = 99;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of elements: ");
        int n = input.nextInt();
        // int arr[] = new int[n];
        int[] arr = new int[n];
        System.out.println("...............................");
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter element: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The elements of array before change...........");
        for (int i = 0; i < n; i++)
        {
            System.out.println("Element of array: " + arr[i]);
        }
        change(arr);
        System.out.println("The elements of array after change...........");
        for (int i = 0; i < n; i++)
        {
            System.out.println("Element of array: " + arr[i]);
        }
    }
}