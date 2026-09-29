//Swap
import java.util.Scanner;
public class Challange7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey");
        System.out.print("Now, please enter your first number: ");
        int x, y;
        x = input.nextInt();
        System.out.print("Now, Plese enter your second number: ");
        y = input.nextInt();
        System.out.println("Ok!, before swaping " + x + " " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Ok!, after swap " + " value is " + x + " " + y);
    }
}