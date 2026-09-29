import java.util.Scanner;
public class sumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int num = input.nextInt();
        int result = Sum(num);
        System.out.println("The sum of digit of " + num + " is " + result + "." );
    }
    public static int Sum(int n)
    {
        int sum = 0;
        while(n != 0)
        {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        return sum;
    }
}