package PatternPriniting;

import java.util.Scanner;

public class SquarePattern
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        System.out.print("Enter number of row: ");
        int col = input.nextInt();
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++) System.out.print("* ");
            System.out.println();
        }
    }
}