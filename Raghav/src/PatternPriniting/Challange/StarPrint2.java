package PatternPriniting.Challange;

import java.util.Scanner;

public class StarPrint2
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
                if((i + j) > row) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}