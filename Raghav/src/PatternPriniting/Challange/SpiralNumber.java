package PatternPriniting.Challange;

import java.util.Scanner;

public class SpiralNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        for(int i = 1; i <= 2 * row - 1; i++)
        {
            for(int j = 1; j <= 2 * row - 1; j++)
            {
                int a = i, b = j;
                if(i > row) a = 2 * row - i;
                if(j > row) b = 2 * row - j;
                System.out.print(Math.min(a, b)+ " ");
            }
            System.out.println();
        }
    }
}