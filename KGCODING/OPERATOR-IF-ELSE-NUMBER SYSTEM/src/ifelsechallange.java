import java.util.Scanner;
public class ifelsechallange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter starting: ");
        int start = input.nextInt();
        System.out.print("Enter end: ");
        int end = input.nextInt();
        while(start >= end)
        {
            System.out.println(start);
            start--;
        }
    }
}