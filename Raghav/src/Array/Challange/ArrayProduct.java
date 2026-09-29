package Array.Challange;

import java.util.Scanner;

public class ArrayProduct
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
        int prod = 1;
        for(int x : arr) prod *= x;
        System.out.println("The product of array element are: " + prod);
    }
}