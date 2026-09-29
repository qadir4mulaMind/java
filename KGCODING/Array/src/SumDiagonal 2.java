import java.util.Scanner;

public class SumDiagonal {

    public static int sumOfDiagonals(int[][] matrix, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];           // main diagonal
            sum += matrix[i][n - 1 - i];   // secondary diagonal
        }
        if (n % 2 != 0)
            sum -= matrix[n / 2][n / 2];   // remove middle element if counted twice

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        int result = sumOfDiagonals(matrix, n);
        System.out.println("Sum of both diagonals: " + result);
    }
}