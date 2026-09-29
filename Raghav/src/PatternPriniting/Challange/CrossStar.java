package PatternPriniting.Challange;

import java.util.Scanner;

public class CrossStar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < row; j++)
            {
                if(j == i || j == row - i - 1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}