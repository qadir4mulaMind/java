package PatternPriniting.Challange;

import java.util.Scanner;

public class NumberVerticallyFilped2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        for (int i = 1; i <= row; i++)
        {
            for(int j = 1; j <= row; j++)
            {
                if((i + j) > row) System.out.print(j + " ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}