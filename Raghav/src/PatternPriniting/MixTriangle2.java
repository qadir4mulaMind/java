package PatternPriniting;

import java.util.Scanner;

public class MixTriangle2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        for(int i = 0; i < row; i++)
        {
            for (int j = 1; j <= i + 1; j++)
            {
                if(i % 2 != 0) System.out.print((char)('A' + j - 1) + " ");
                else System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}