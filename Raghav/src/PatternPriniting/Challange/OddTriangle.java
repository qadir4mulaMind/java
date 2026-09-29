package PatternPriniting.Challange;

import java.util.Scanner;

public class OddTriangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        for (int i = 1; i <= row; i++)
        {
            for (int j = 1; j <= i; j++) System.out.print(2 * j - 1 + " ");
            System.out.println();
        }
    }
}