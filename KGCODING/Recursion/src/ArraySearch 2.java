public class ArraySearch {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Search!");

        System.out.print("Enter size of array: ");
        int size = ArrayUtility.input.nextInt();

        int[] arr = new int[size];

        ArrayUtility.inputArray(arr, size - 1);

        System.out.println("You entered: ");
        ArrayUtility.printArray(arr, 0);

        // Now search
        System.out.print("\nEnter number to search: ");
        int target = ArrayUtility.input.nextInt();

        boolean found = false;
        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("✅ Element found.");
        else
            System.out.println("❌ Element not found.");
    }
}