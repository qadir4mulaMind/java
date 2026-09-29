import java.util.Scanner;
public class IfElse {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = 1;
        System.out.print("Enter number: ");
        int n = input.nextInt();
        while(num <= n)
        {
            System.out.println(num);
            num += 1;
        }
    }
}