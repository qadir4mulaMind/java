package Loops;

import java.util.Scanner;

public class PrimeComposit
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        boolean flag = false;
        for(int i = 2; i < Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                flag = true;
                break;
            }
        }
        System.out.printf(n + " is %s", flag == false ? "prime number." : "composit number.");
    }
}