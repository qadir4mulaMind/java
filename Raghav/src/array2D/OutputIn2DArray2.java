package array2D;

public class OutputIn2DArray2
{
    public static void main(String[] args)
    {
        int[][] arr = new int[3][4];
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++) System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        int[][] arr2 = {{6, 0, 2, 7}, {1, 3, 7, 2}, {9, 9, 4, 5}};
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++) System.out.print(arr2[i][j] + " ");
            System.out.println();
        }
    }
}