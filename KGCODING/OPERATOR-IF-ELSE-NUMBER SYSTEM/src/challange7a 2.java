//Swap Method 2
import java.util.Scanner;
public class challange7a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swaping station!!");
        System.out.print("Now, please enter your first number: ");
        int x, y, temp;
        x = input.nextInt();
        System.out.print("Now, Plese enter your second number: ");
        y = input.nextInt();
        System.out.println("Ok!, before swaping " + x + " " + y);
        temp = x;
        x =  y;
        y = temp;
        System.out.println("Ok!, after swap " + " value is " + x + " " + y);
    }
}