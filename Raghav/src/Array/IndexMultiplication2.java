package Array;

import java.util.Scanner;

public class IndexMultiplication2
{
    public static void multiply(int[] a)
    {
        int l = a.length;
        for(int i = 0; i < l; i++)
        {
            if(a[i] % 2 == 0) a[i] *= 10;
            else a[i] *= 2;
        }
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
            System.out.print("Enter first element: ");
            arr[i] = input.nextInt();
        }
        System.out.println("The element of array...........");
        for(int i = 0; i < n; i++)
        {
            System.out.println("Element of array: " + arr[i]);
        }
        multiply(arr);
        System.out.println("Modifyed array.................");
        for(int i = 0; i < n; i++)
        {
            System.out.println("Element of array: " + arr[i]);
        }
    }
}