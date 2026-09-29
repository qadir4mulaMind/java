package recursion;

import java.util.Scanner;

public class Power2 {
    public static int power(int i, int j) {
        if (j == 0) return 1;
        int call = power(i, j / 2);
        return (j % 2) == 0 ? call * call : i * call * call;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please base power: ");
        int b = input.nextInt();
        System.out.print("Please enter power: ");
        int p = input.nextInt();
        System.out.println("Ok!! " + b + " raise to the " + p + " is: " + power(b, p));

    }
}
