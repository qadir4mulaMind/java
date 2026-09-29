import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter your command: ");
            String command = input.next();
            if (command.equals("Exit")) {
                break;
            }
        }
        System.out.println("You have successfully exited");
        input.close(); // Close the Scanner to prevent resource leaks
    }
}