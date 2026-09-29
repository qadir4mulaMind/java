package ConditionalStatement.Challange;

import java.util.Scanner;

public class profitLoss
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        double costpr = input.nextDouble();
        System.out.print("Enter selling price: ");
        double selpr = input.nextInt();
        if(selpr > costpr) System.out.println("Profit of " + (selpr - costpr));
        else if(selpr == costpr) System.out.println("No Profit! No Loss!");
        else System.out.println("Loss of " + (costpr - selpr));
    }
}