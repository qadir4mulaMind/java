package array2D;

import java.util.Scanner;

public class MaximumSumIndividualRaw2
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

        int maxSum = Integer.MIN_VALUE;
        int maxRowIndex = -1;
        for (int i = 0; i < arr.length; i++)
        {
            int rowSum = 0;
            for (int j = 0; j < arr[0].length; j++)
            {
                rowSum += arr[i][j];
            }
            if (rowSum > maxSum)
            {
                maxSum = rowSum;
                maxRowIndex = i;
            }
        }
        System.out.println("Row " + maxRowIndex + " has the maximum sum: " + maxSum);
    }
}