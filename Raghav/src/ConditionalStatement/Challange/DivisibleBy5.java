package ConditionalStatement.Challange;

import java.util.Scanner;

public class DivisibleBy5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        if(n % 5 == 0) System.out.println("Divisible");
        else System.out.println("Not Divisible");
    }
}