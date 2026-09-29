import java.util.Scanner;

public class SumAvg2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        int[][] arr = new int[rows][cols];
        int sum = 0;
        int totalElements = rows * cols;

        System.out.println("Enter elements of 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
                sum += arr[i][j];
            }
        }

        double average = (double) sum / totalElements;

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: " + average);
    }
}