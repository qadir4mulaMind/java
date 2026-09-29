import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Please enter term: ");
        int term = input.nextInt();
        fcn(term);
    }
    public static void fcn(int x)
    {
       int i = 1, first = 0, second = 1, next;
       while(i <= x)
       {
           System.out.print(first + " ");
           next = first + second;
           first = second;
           second = next;
           i++;
       }
    }
}