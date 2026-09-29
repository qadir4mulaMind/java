package PatternPriniting;

import java.util.Scanner;

public class SolidStar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        for (int i = 1; i <= row; i++)
        {
            for (int j = 1; j <= row - i; j++) System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("* ");
            System.out.println();
        }
        for(int i = 1; i < row; i++)
        {
            for(int j = 1; j <= i; j++) System.out.print("  ");
            for (int j = 2 * row - 1; j >= 2 * i + 1; j--) System.out.print("* ");
            System.out.println();
        }
    }
}