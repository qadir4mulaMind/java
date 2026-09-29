package ConditionalStatement;

import java.util.Scanner;

public class Absolute
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = input.nextInt();
        // if n < 0 -> n = -n;
        System.out.println("The absolute Value of " + n + " is : " + (n >= 0 ? n : -n));
        if(n < 0) n = -n;
        System.out.println(n);
        double x = 97.9;
        System.out.println(x % 2);
    }
}