import java.lang.*;
import java.util.*;
class Add1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.printf("Enter the first number: ");
                x = sc.nextInt();
		System.out.printf("Enter second number: ");
		y = sc.nextInt();
		System.out.println("The sum of " + x + " and " + y + " is: " + (x + y));
	}
}