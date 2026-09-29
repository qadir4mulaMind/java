package array2D;

public class TransposeOfAMatrix
{
    public static void main(String[] args)
    {
        int[][] arr = {{2, 8, 3, 4}, {7, 2, 1, 6}, {5, 5, 4, 1}, {3, 1, 8, 2}};
        for(int[] x : arr)
        {
            for(int y : x) System.out.print(y + " ");
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < i; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int[] x : arr)
        {
            for(int y : x) System.out.print(y + " ");
            System.out.println();
        }
    }
}