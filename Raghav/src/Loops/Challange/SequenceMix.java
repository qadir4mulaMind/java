package Loops.Challange;

import java.util.Scanner;

public class SequenceMix
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int x = input.nextInt();
        System.out.println(1);
        System.out.println("n");
        int i = 2, j = 1;
        while(i <= x)
        {
            System.out.println(i);
            System.out.println("n-" + j);
            i++;
            j++;
        }
    }
}