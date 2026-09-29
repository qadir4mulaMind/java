import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int n = input.nextInt();
        System.out.println("The absolute value of " + n + " is " + mode(n));
    }
    public static int mode(int num)
    {
        return num > 0 ? num : -num;
    }
}