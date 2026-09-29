package methods;

import java.util.Scanner;

public class Swap
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter number second number: ");
        int n2 = input.nextInt();
        System.out.println(n1 + " " + n2);
        int temp = n1;
        n1 = n2; n2 = temp;
        System.out.println(n1 + " " + n2);
    }
}