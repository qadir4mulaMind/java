package Array;

import java.util.Scanner;

public class SearchArray
{
    public static int search(int[] a, int target)
    {
        int l = a.length;
        for(int i = 0; i < l; i++)
        {
           if(a[i] == target)
               return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("...............................");
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter " + (i + 1) +  " element: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The element of array...........");
        for(int i = 0; i < n; i++) System.out.println("Element " +  (i + 1) + " of array: " + arr[i]);

        System.out.print("Enter target element: ");
        int target = input.nextInt();
        int index = search(arr, target);
        if(index != -1) System.out.println("Element is  found at " + index + " index.");
        else System.out.println("Element is not found.");
    }
}