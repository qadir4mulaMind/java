package ConditionalStatement;

import java.util.Scanner;

public class PositionOfXAndY
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        int x = input.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = input.nextInt();
        if(x == 0 && y == 0) System.out.printf("(%d, %d) is at origin.", x, y);
        else if(x == 0 && y != 0) System.out.printf("(%d, %d) is lie on y axis.", x, y);
        else if(y == 0 && x != 0) System.out.printf("(%d, %d) is lie on x axis.", x, y);
        else if(x > 0 && y > 0) System.out.printf("(%d, %d) is lie in first quadrant.", x, y);
        else if(x < 0 && y > 0) System.out.printf("(%d, %d) is lie in second quadrant.",x, y);
        else if(x < 0 && y < 0) System.out.printf("(%d, %d) is lie in third quadrant.", x , y);
        else System.out.printf("(%d, %d) is lie in fourth quadrant.",x, y);
    }
}