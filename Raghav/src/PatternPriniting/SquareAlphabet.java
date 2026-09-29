package PatternPriniting;

import java.util.Scanner;

public class SquareAlphabet
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        for(char i = 'A'; i < row + 'A'; i++)
        {
            for (char j = 'A'; j < 'A' + row; j++) System.out.print( i + " ");
            System.out.println();
        }
    }
}