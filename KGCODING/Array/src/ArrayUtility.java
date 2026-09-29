import java.util.Scanner;
public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of element: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        System.out.println("Enter the elemnt of array.........");
        while(i < size)
        {
            System.out.print("Please enter the number " + (i + 1) + " : ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
    public static void Display(int[] a)
    {
        System.out.println("The entered element are..........");
        int size = a.length;
        int j = 0;
        while(j < size)
        {
            System.out.print("Element " + (j + 1) + " : " + a[j] + '\n');
            j++;
        }
    }
}