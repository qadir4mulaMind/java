package string;

import java.util.Scanner;

public class CountDigit
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String x = "" + n;
        System.out.println(x.length());
//        String s = input.nextLine();
//        int count = s.startsWith("-") ? s.length() - 1 : s.length();
//        System.out.println(count);

    }
}