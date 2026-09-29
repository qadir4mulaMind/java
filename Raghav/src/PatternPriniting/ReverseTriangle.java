package PatternPriniting;

import java.util.Scanner;

public class ReverseTriangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        for(int i = 0; i < row; i++)
        {
            for (int j = row; j >= i + 1; j--) System.out.print("* ");
            System.out.println();
        }
    }
}