package PatternPriniting;

import java.util.Scanner;

public class SquareAlphabet2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        for(char i = 'A'; i < row + 'A' ; i++)
        {
            for(int j  = 0; j < row ; j++)
            {
                if(i % 2 != 0) System.out.print((char)(i + 32) + " ");
                else System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}