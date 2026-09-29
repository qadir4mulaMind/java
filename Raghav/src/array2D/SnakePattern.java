package array2D;

import java.util.Scanner;

public class SnakePattern
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

        System.out.println("Sanke Print.......");
        for (int i = 0; i < arr.length; i++)
        {
            if(i % 2 == 0)
            {
                for (int j = 0; j < arr[0].length; j++)
                {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            else
            {
                for(int j = arr[0].length - 1; j >= 0; j--)
                {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}