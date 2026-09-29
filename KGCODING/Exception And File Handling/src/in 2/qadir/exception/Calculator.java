package in.qadir.exception;

import com.sun.source.tree.CatchTree;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        a();
    }
     private static void a()
     {
         b();
     }

    private static void b()
    {
        c();
    }

    private static void c()
    {
        d();
    }

    private static void d()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Division Calculator!\n");
        System.out.print("Please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Please enter your second number: ");
        int second = input.nextInt();

        try
        {
            int [] a = new int[5];
            //System.out.println("Result is: " + a[6]);
            //a[6] = first / second;
            //System.out.printf("Result is : %d\n", a[6]);
        }
        catch(ArithmeticException exception)
        {
            System.out.printf("%s, invalid!\n", exception.getMessage() );
        }
        catch (Throwable th)
        {
            System.out.println("General exception");
            throw th;
        }
        finally
        {
            System.out.println("I am in finally.");
        }
    }


}