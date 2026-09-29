package Loops;

import java.util.Scanner;

public class CountDigit2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt(),count = 0;
        if(n == 0) System.out.println(n + " has 1 digit.");
        else
        {
            while(n != 0)
            {
                count++;
                n /= 10;
            }
            System.out.println(n + " has " + count + " digit.");
        }
    }
}