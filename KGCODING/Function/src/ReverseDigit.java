import java.util.Scanner;
public class ReverseDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Plaese enter your number: ");
        int num = input.nextInt();
        int result = reverse(num);
        System.out.println("The reverse of " + num + " is " + result);
    }
    public static int reverse(int x)
    {
        int res = 0;
        int rem;
        while(x != 0)
        {
            res *= 10;
            rem = x % 10;
            res += rem;
            x /= 10;
        }
        return res;
    }
}