package PatternPriniting;

import java.util.Scanner;

public class SquareAbphabet
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        for(int i = 0; i < row; i++)
        {
            for (char j = 'A'; j < 'A' + row; j++) System.out.print(j + " ");
            System.out.println();
        }
    }
}