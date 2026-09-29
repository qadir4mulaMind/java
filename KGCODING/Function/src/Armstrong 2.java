import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int n = input.nextInt();
        boolean result = arm(n);
        if(result) System.out.println(n + " is Armstrong number.");
        else System.out.println(n + " is not a Armstrong number.");
    }
    public static boolean arm(int x)
    {
        int rem, sum = 0, a = x;
        while(x != 0)
        {
            rem = x % 10;
            sum += rem * rem * rem;
            x /= 10;
        }
        if(sum == a) return true;
        else return false;
    }
}