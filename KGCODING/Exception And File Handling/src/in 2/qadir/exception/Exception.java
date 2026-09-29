package in.qadir.exception;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int n2 = input.nextInt();
        try
        {
            double result = n1 / n2;
            System.out.println(n1 + " divide by " + n2 + " is " + result);
        }
        catch(ArithmeticException exp)
        {
            if(exp.getMessage().equals(" / by zero")) System.out.println("Division by zero is not a valid operation.");
            else throw exp;
        }
    }
}