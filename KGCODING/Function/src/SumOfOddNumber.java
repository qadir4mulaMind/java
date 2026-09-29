import java.util.Scanner;
public class SumOfOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int num = input.nextInt();
        int result = SumAll(num);
        System.out.println("The sum from 1 to " + num + " is " + result + "." );
    }
    public static int SumAll(int n)
    {
        int i = 1;
        int sum = 0;
        while(i <= n)
        {
            sum += i;
            i++;
        }
        return sum;
    }
}