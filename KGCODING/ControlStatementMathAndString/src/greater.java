import java.sql.SQLOutput;
import java.util.Scanner;
public class greater
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number cheker\n");
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter your second number: ");
        int num2 = input.nextInt();
        boolean result = great(num1, num2);
        if(result)
        {
            System.out.println(num1 + " is greater than " + num2);
        }
        else
        {
            System.out.println(num2 + " is greater than " + num1);
        }
    }
    public static boolean great(int n1, int n2)
    {
        return n1 > n2;
    }
}
