import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        System.out.println("Welcome to Table!");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter number the number whose table you want to print: ");
        int n = input.nextInt();
        table(n);
    }
    public static void table(int n)
    {
        int i = 1;
        while(i <= 10)
        {
            System.out.println(i * n);
            i++;
        }
    }
}