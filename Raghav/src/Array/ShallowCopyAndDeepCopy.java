package Array;

import java.util.Arrays;

public class ShallowCopyAndDeepCopy
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        int[] x = arr; // Shallow copy of array
        x[0] = 88;
        System.out.println(arr[0]);
        System.out.println(x[0]);
        int[] deep = Arrays.copyOf(arr, arr.length);
        deep[0] = 18;
        System.out.println(deep[0]);
        System.out.println(arr[0]);
    }
}