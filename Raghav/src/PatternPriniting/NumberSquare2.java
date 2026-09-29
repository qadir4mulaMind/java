package PatternPriniting;

import java.util.Scanner;

public class NumberSquare2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        for(int i = 1; i <= row; i++)
        {
            for (int j = 1; j <= row; j++) System.out.print(i + " ");
            System.out.println();
        }
    }
}