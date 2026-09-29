import java.sql.SQLOutput;
import java.util.Scanner;
public class TernaryOperator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number cheker\n");
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter your second number: ");
        int num2 = input.nextInt();
        int greater = num1 > num2 ? num1 : num2;
        System.out.println(greater + " is greatest number.");
    }
}
