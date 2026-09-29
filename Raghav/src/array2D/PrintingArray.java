package array2D;

public class PrintingArray
{
    public static void main(String[] args)
    {
        int[][] arr = {{6, 0, 2, 7, 6}, {1, 3, 7, 2, 2}, {9, 9, 4, 5, 2}};
        for(int i = 0; i < arr.length; i++)
        {
            for(int x : arr[i]) System.out.print(x + " ");
            System.out.println();
        }
        System.out.println();

        for(int[] x: arr)
        {
            for(int y : x) System.out.print(y + " ");
            System.out.println();
        }
    }
}