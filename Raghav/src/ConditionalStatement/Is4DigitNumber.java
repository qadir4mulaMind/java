package ConditionalStatement;

import java.util.Scanner;

public class Is4DigitNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = input.nextInt();
        if(n > 999 && n < 10000) System.out.println(n + " is four digit number.");
        else System.out.println(n + " is not a four digit number!");
    }
}