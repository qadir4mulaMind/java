package PatternPriniting;

import java.util.Scanner;

public class SquareNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        for(int i = 0; i < row; i++)
        {
            for (int j = 1; j <= row; j++) System.out.print(j + " ");
            System.out.println();
        }
    }
}