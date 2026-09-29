import java.util.Scanner;

public class OccForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find occurences!");
        System.out.print("Please enter size of array: ");
        int size = input.nextInt();
        int[] nums = new int[size];

        ArrayUtility.inputArray(nums, size - 1);
        System.out.println("You entered: ");
        ArrayUtility.printArray(nums, 0);

        System.out.print("Enter the number you want to search: ");
        int element = input.nextInt();
        int occ = Occur(nums, element);
        System.out.println("Your element was found: " + occ + " times.");
    }

    public static int Occur(int[] n, int ele)
    {
        int occ = 0;
        for(int num : n)
        {
            if(num == ele)
            {
                occ++;
            }
        }
        return occ;
    }
}