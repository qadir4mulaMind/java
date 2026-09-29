package string;

import java.util.Scanner;

public class StringBasic
{
    public static void change(String x) // pass by value
    {
        x = "Ravi";
    }
    public static void main(String[] args)
    {
//        char[] str = {'P', 'r', 'i', 'y', 'a'};
//        for(char ele : str) System.out.print(ele + " ");
//        System.out.println();
//        System.out.println("Shruti is a good girl and vineet is also.");
//        String x = "Shruti is a good girl.";
//        System.out.println(x);
//        Scanner input = new Scanner(System.in);
//        String y = input.next(); // space ke aage ka input raed nhi karega.
//        System.out.println(y);
//        String a = input.nextLine();
//        System.out.println(a);
        String x = "Abhinav";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}