import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        System.out.println("Welcome to Password Checker.");
        System.out.print("Please enter the password: ");
        Scanner input = new Scanner(System.in);
        String password = input.next();

        String pass;
        do {
            System.out.print("Please enter your Correct password: ");
            pass = input.next();
        } while (!password.equals(pass));

        System.out.println("Your Password is matched.");
    }
}