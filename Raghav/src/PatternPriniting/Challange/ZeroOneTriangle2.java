package PatternPriniting.Challange;

import java.util.Scanner;

public class ZeroOneTriangle2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        int val;
        for (int i = 1; i <= row; i++)
        {
            val = (i % 2 == 0) ? 0 : 1; // starting value
            for (int j = 1; j <= i; j++)
            {
                System.out.print(val + " ");
                val = 1 - val; // toggle 0 ↔ 1
            }
            System.out.println();
        }
    }
}