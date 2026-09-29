import java.util.Scanner;
public class Challange2 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our first Calculator....");
        System.out.print("Now, please enter your first number: ");
        int x, y;
        x = input.nextInt();
        System.out.print("Now, please enter your second number: ");
        y = input.nextInt();
        System.out.println("OK, The Sum of " + x + " and " + y + " is : " + (x + y));
    }
}