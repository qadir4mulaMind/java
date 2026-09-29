import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int num = input.nextInt();
        int result = fact(num);
        System.out.println("The factorial " + num + " is " + result + "." );
    }
    public static int fact(int n)
    {
        int i = 1;
        int prod = 1;
        while(i <= n)
        {
            prod *= i;
            i++;
        }
        return prod;
    }
}