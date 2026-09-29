package array2D;

import java.util.Scanner;

public class printElementOfArrayInColumnWise
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
        for(int i = 0; i < arr[0].length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                System.out.println("Element at (" + j + "," + i + "): " + arr[j][i]);
            }
        }
    }
}