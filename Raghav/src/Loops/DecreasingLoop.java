package Loops;

import java.util.Scanner;

public class DecreasingLoop
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        for(int i = n; i > 0; i--) System.out.print(i + " ");
        System.out.println();
    }
}