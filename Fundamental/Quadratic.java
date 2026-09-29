import java.lang.*;
import java.util.Scanner;
class Quadratic
{
	public static void main(String args[])
	{
		int a, b, c;
		double r1, r2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value of a: ");
		a = sc. nextInt();
		System.out.print("Enter Value of b: ");
		b = sc. nextInt();
		System.out.print("Enter Value of c: ");
		c = sc. nextInt();
		r1 = (- b + Math.sqrt(b * b - 4 * a * c))/(2 * a);
		r2 = (- b - Math.sqrt(b * b - 4 * a * c))/(2 * a);
		System.out.println("The root 1 is : " + r1 + " and root 2 is : " + r2);
	}
}

		
		