import java.lang.*;
import java.util.Scanner;
class Calculator
{
	public static void main(String arge[])
	{
		float base, height, area;
		System.out.print("Enter Base: ");
		Scanner sc = new Scanner(System.in);
		base = sc.nextFloat();
		System.out.print("Enter Height: ");
		height = sc.nextFloat();
		area = base * height * 0.5f;
		System.out.println("Area of triangle is : " + area);
	}
}

 