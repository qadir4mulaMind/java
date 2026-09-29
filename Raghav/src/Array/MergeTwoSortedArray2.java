package Array;

import java.util.Scanner;

public class MergeTwoSortedArray2
{
    public static int[] merge(int[] a1, int[] a2)
    {
        int n1 = a1.length;
        int n2 = a2.length;
        int[] temp = new int[n1 + n2];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n1 && j < n2)
        {
            if(a1[i] < a2[j]) temp[k++] = a1[i++];
            else temp[k++] = a2[j++];
        }
        while(i < n1) temp[k++] = a1[i++];
        while(j < n2) temp[k++] = a2[j++];
        return temp;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array...");
        for (int i = 0; i < n1; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array...");
        for (int i = 0; i < n2; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            arr2[i] = sc.nextInt();
        }

        // Print arrays
        System.out.println("First array is:");
        for (int i = 0; i < n1; i++) {
            System.out.println("Element " + (i + 1) + " : " + arr1[i]);
        }

        System.out.println("Second array is:");
        for (int i = 0; i < n2; i++) {
            System.out.println("Element " + (i + 1) + " : " + arr2[i]);
        }
        int[] ans = new int[n1 + n2];
        ans =  merge(arr1, arr2);
        System.out.println("Element of merging array.................");
        for (int i = 0; i < (n1 + n2); i++) {
            System.out.println("Element " + (i + 1) + " : " + ans[i]);
        }
    }
}