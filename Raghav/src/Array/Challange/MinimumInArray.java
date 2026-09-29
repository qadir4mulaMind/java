package Array.Challange;

import java.util.Scanner;

public class MinimumInArray
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
        int mini = arr[0];
        // int min = Integer.MAX_VALUE;
        for(int x : arr)
        {
            if(mini > x) mini = x;
        }
        System.out.println("...............................");
        System.out.println("The minimum in array element is: " + mini);
    }
}