package Array;

import java.util.Scanner;

public class ArraySum
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
            System.out.print("Enter element: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The elements of array...........");
        for (int i = 0; i < n; i++)
        {
            System.out.println("Element of array: " + arr[i]);
        }
        int sum = 0;
        for(int x : arr) sum += x;
        System.out.println("The sum of array element are: " + sum);
    }
}