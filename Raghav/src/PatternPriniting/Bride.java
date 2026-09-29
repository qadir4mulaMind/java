package PatternPriniting;

import java.util.Scanner;

public class Bride
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        for(int i = 0; i < 2 * row - 1; i++) System.out.print("* ");
        System.out.println();
        for (int i = 1; i <= row - 1; i++)
        {
            for (int j = 1; j < row + 1 - i; j++) System.out.print("* ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("  ");
            for (int j = 1; j < row + 1 - i; j++) System.out.print("* ");
            System.out.println();
        }
    }
}