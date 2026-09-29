package Loops.Challange;

import java.util.Scanner;

public class Table2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        for(int i = 1; i <= 10; i++) System.out.print(n * i + " ");
        System.out.println();
    }
}