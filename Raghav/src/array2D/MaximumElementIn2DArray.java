package array2D;

import java.util.Scanner;

public class MaximumElementIn2DArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = input.nextInt();
        System.out.print("Enter column: ");
        int col = input.nextInt();

        int[][] arr = new int[row][col];
        System.out.println("Enter elements:");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print("Enter element at (" + i + "," + j + "): ");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("\nThe entered elements are:");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                System.out.println("Element at (" + i + "," + j + "): " + arr[i][j]);
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                if(arr[i][j] > max) max = arr[i][j];
            }
        }

        System.out.println("The maximum element of array is : " + max);
    }
}