package Loops;

import java.util.Scanner;

public class Power
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        int b = input.nextInt();
        System.out.print("Enter power: ");
        int p = input.nextInt(), power = 1;
        for(int i = 1; i <= p; i++)
        {
            power *= b;
        }
        System.out.println(b + " raise to the power " + p + " is: " + power );
    }
}