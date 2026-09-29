package Loops.Challange;

import java.util.Scanner;

public class Sequenc
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = input.nextInt();
        for(int i = 1, j = n; i <= n && j >= 1; i++, j--)
        {
            System.out.print(i + " ");
            System.out.print(j  + " ");
        }
    }
}