package Array;

import java.sql.SQLOutput;
import java.util.Scanner;

import java.util.Scanner;

public class SecondMax
{
    public static int secondMax(int[] a)
    {
        int n = a.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int maxIndex = -1, secondMaxIndex = -1;
        for (int i = 0; i < n; i++)
        {
            if (a[i] > max)
            {
                secondMax = max;
                secondMaxIndex = maxIndex;
                max = a[i];
                maxIndex = i;
            } else if (a[i] > secondMax && a[i] != max)
            {
                secondMax = a[i];
                secondMaxIndex = i;
            }
        }
        return secondMaxIndex;
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
            System.out.print("Enter " + (i + 1) + " element: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The entered elements of array are:");
        for (int i = 0; i < n; i++) System.out.println("Element " + (i + 1) + " of Array is: " + arr[i]);
        int index = secondMax(arr);
        if (index != -1) System.out.println("The second largest element is " + arr[index] + " at index: " + index);
        else System.out.println("No second largest element found.");
    }
}