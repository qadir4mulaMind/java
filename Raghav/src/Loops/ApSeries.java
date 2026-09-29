package Loops;

import java.util.Scanner;

public class ApSeries
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first term: ");
        int a = input.nextInt();
        System.out.print("Enter common difference: ");
        int d = input.nextInt();
        System.out.print("Enter no of term: ");
        int n = input.nextInt();
        for(int i = 1; i <= n; i++)
        {
            System.out.print(a + (i - 1) * d + " ");
        }
    }
}