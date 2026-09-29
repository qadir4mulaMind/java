package PatternPriniting;

import java.util.Scanner;

public class RevereseFlipedNumber2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        for (int i = 1; i <= row; i++)
        {
            for (int j = row; j >= i; j--) System.out.print(j + " ");
            System.out.println();
        }
    }
}