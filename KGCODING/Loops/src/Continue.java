import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter starting starting position: ");
        int start = input.nextInt();
        System.out.print("Now enter ending position: ");
        int end = input.nextInt();

        int i = start;
        while(i <= end)
        {
            if(i % 2 == 0)
            {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}