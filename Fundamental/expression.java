import java.lang.*;
import java.util.Scanner;
class expression
{
	public static void main(String args[])
	{
		int s1, s2, s3;
		float s;
		double Area;
		System.out.print("Enter side 1: ");
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextInt();
		System.out.print("Enter side 2: ");
		s2 = sc.nextInt();
		System.out.print("Enter side 3: ");
		s3 = sc.nextInt();
		s = (s1 + s2 + s3) /2f;
		Area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
		System.out.println("The Area of Triange: " + Area);
	}
} 