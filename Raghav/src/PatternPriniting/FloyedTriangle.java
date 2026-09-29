package PatternPriniting;

import java.util.Scanner;

public class FloyedTriangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        int x = 1;
        for (int i = 1; i <= row; i++)
        {
            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }
}