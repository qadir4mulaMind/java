package PatternPriniting.Challange;

import java.util.Scanner;

public class FlippedStar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        for (int i = 0; i < row; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("  ");
            }
            for(int j = row; j > i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}