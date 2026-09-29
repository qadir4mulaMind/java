package PatternPriniting.Challange;

import java.util.Scanner;

public class AlphabetVerticallFliped
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < row - i; j++)
            {
                System.out.print("  ");
            }
            for(int j = 0; j <= i; j++)
            {
                System.out.print((char)(i + 'A') + " ");
            }
            System.out.println();
        }
    }
}