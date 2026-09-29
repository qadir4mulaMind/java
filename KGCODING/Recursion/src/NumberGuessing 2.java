import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welocome to guessing number!");
        System.out.print("Computer input: ");
        int cin = input.nextInt();

        int gn;
        do
        {
            System.out.print("Please guess the number between 1 to 10: ");
            gn = input.nextInt();
        }while(cin != gn);
        System.out.println("You have sucessfully guess the number.");
    }
}