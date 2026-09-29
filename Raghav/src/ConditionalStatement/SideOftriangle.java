package ConditionalStatement;

import java.util.Scanner;

public class SideOftriangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int s1 = input.nextInt();
        System.out.print("Enter side 2: ");
        int s2 = input.nextInt();
        System.out.print("Enter side 3: ");
        int s3 = input.nextInt();
        if(s1 + s2 >= s3 && s2 + s3 >= s1 && s1 + s3 >= s2) System.out.println(s1 + "," + s2 + "," + s3 + " are the side of the triangle.");
        else System.out.println(s1 + "," + s2 + "," + s3 + " are not the side of the triangle.");
    }
}