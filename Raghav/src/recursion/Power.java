package recursion;

import java.util.Scanner;

public class Power {
    public static int power(int i, int j){
        if(j == 0) return 1;
        return i * power(i , j - 1);
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