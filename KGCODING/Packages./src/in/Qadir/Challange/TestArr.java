package in.Qadir.Challange;

import java.util.Scanner;

public class TestArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayOperation obj = new ArrayOperation(arr);
        ArrayOperation.Statics stats = obj.new Statics();

        System.out.println("Mean: " + stats.mean());
        System.out.println("Median: " + stats.median());
    }
}