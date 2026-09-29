package array2D;

import java.util.Scanner;

public class ShallowCpyDeepCopy
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] brr = {{12, 11, 10, 9}, {8, 7, 6, 5}, {4, 3, 2, 1}};
        brr[1][3] = 20;
        System.out.println(arr[1][3]);
        System.out.println("Enter element.................");
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                System.out.print("Enter element " + arr[i][j] + " : ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("\nThe enterd element are.......");
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                System.out.println("Element " + arr[i][j] + " : " + arr[i][j]);
            }
        }
    }
}