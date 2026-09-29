import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner input = new Scanner(System .in);
        System.out.print("Please enter number: ");
        int num = input.nextInt();
        int i = 1;
        while(i <= num )
        {
            if(i == num - 1)
            {
                System.out.println("Break is executed.");
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}