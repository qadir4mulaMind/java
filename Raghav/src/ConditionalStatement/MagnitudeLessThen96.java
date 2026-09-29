package ConditionalStatement;

import java.util.Scanner;

public class MagnitudeLessThen96
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        if(n < 0) n = -n;
        if(n < 96) System.out.println("Yes😀");
        else System.out.println("No😥");
    }
}