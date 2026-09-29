package Loops.Challange;

import java.util.Scanner;

public class AllFactor
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        for(int i = 1; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
                System.out.print( n / i + " ");
            }
        }
    }
}