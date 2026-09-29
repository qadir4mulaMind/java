package Array;

public class sortArrayBuiltin
{
    public static void print(int[] a)
    {
        for(int x : a) System.out.print(x + " ");
    }
    public static void main(String[] args)
    {
        int[] arr = {4, 1, 7, 5, -3, 10, 2};
        print(arr);

    }
}