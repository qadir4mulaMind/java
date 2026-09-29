package Array;

public class ArrayBasic
{
    public static void main(String[] args)
    {
        int[] x = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(x[0]);
        x[0] = 9;
        System.out.println(x[0]);
        int[] arr = new int[8];
        arr[0] = 20;
        System.out.println(arr[0]);
        System.out.println(arr[7]);
    }
}