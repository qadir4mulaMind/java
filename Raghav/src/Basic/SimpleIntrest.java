package Basic;

import java.util.Scanner;

public class SimpleIntrest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double principle, simpleIntrest;
        int time, rate;
        System.out.print("Enter principle: ");
        principle = input.nextInt();
        System.out.print("Enter rate: ");
        rate = input.nextInt();
        System.out.print("Enter time: ");
        time = input.nextInt();
        simpleIntrest = principle * rate * time / 100;
        System.out.println("Your simple intrest is: " + simpleIntrest);

    }
}