import java.util.Scanner;

public class ArrayToString {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        String str = "";
        System.out.println("Please enter the elemnt of array......");
        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("The Enterd element are..........");
        for(int j = 0; j < size; j++)
        {
            System.out.println("Element " + (j + 1) + " : " + arr[j] );
        }
        for(int k = 0; k < size; k++)
        {
            if(k == 0) {
                str += arr[k];
            } else {
                str += ", " + arr[k];  // Comma se separate karo
            }
        }
        System.out.println("Integer Array after converting into string is " + str);
        System.out.println(str.getClass().getSimpleName());

    }
}