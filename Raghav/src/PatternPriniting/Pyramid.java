package PatternPriniting;

import java.util.Scanner;

public class Pyramid
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < row - i - 1; j++)
            {
                System.out.print("  ");
            }
            for(int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            for(int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }
}