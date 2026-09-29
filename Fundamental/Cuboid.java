import java.lang.*;
import java.util.Scanner;
class Cuboid 
{
	public static void main(String args[])
	{
		int length, breadth, height;
		float volume, TotalArea;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		length = sc.nextInt();
		System.out.print("Enter Breadth: ");
		breadth = sc.nextInt();
		System.out.print("Enter Height: ");
		height = sc.nextInt();
		TotalArea = 2 * (length * breadth + breadth * height + height * length);
		volume = length * breadth * height;
		System.out.println("Volume of Cuboid is : " + volume + " and Total area of Cuboid: " + TotalArea);
	}
}
				