package Array;

import java.util.Scanner;

public class ReverseArray
{
    public static void reverse(int[] a)
    {
        int n = a.length;
        int i = 0, j = n - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return;
        // for(int i = 0; i < n / 2; i++)
        //{
        //    int temp = arr[i];
        //    arr[i] = arr[n - 1 - i];
        //    arr[n - 1 - i] = temp;
        //}
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
        System.out.println("The entered elements of array before reverse");
        for (int i = 0; i < n; i++) System.out.println("Element " + (i + 1) + " of Array is: " + arr[i]);
        reverse(arr);
        System.out.println("Element of array after reverse..............");
        for(int i = 0; i < n; i++) System.out.println("Element " + (i + 1) + " of array is: " + arr[i]);
    }
}