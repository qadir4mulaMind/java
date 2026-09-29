package Array;

import java.util.Scanner;

public class MaximumElementInArray2
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
        int max = arr[0];
        // int max = Integer.MIN_VALUE;
        for(int x : arr)
        {
            if(max < x) max = x;
        }
        System.out.println("The maximum in array element are: " + max);
    }
}