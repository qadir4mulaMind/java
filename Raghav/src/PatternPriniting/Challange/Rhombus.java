package PatternPriniting.Challange;

import java.util.Scanner;

public class Rhombus
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
            for(int j = 0; j < row; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}