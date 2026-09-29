import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pealse Enter first number: ");
        int num = input.nextInt();
        System.out.println(oddEven(num));
    }
    public static String oddEven(int n)
    {
        String eo = (n % 2 == 0) ? "Number is Even." : "Number is Odd.";
        return eo;
    }
}