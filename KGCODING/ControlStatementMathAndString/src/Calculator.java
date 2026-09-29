import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Calculator!");

        System.out.print("Please enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Now enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Please tell me about your operation \n" +
                "if you want to Addition press + \n" +
                "if you want to perform Subtraction press -\n" +
                "if you want to perform Multiplication press *\n" +
                "if you want to perform Division press /\n" +
                "please enter your choice: ");
        char op = input.next().charAt(0); // take char input for operator

        int output = result(num1, num2, op);
        System.out.println(num1 + " " + op + " " +  num2 + " = " + output);
    }

    public static int result(int m, int n, char x) {
        return switch (x) {
            case '+' -> m + n;
            case '-' -> m - n;
            case '*' -> m * n;
            case '/' -> (n != 0) ? m / n : 0; // handle divide by zero
            default -> {
                System.out.println("Invalid operator!");
                yield 0;
            }
        };
    }
}