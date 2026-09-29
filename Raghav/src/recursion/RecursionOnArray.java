package recursion;

public class RecursionOnArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 12, 76, 9, 34, 5};
        //recPrint(arr, 0);
        // revPrint(arr, arr.length - 1);
        // revPrint2(arr,0);
        int ele = 76;
        System.out.println(exists(arr, ele, 0));
    }

    public static boolean exists(int[]arr, int ele, int idx){ // Linear search
        if(idx == arr.length) return false;
        if(arr[idx] == ele) return true;
        return exists(arr, ele, idx + 1);
    }

    public static void revPrint2(int[] arr, int idx){ // Reverse print
        if(idx == arr.length) return ;
        revPrint2(arr, idx + 1);
        System.out.print(arr[idx] + " ");
    }

    public static void revPrint(int[] arr, int idx){ // Reverse Print
        if(idx < 0) return;
        System.out.print(arr[idx] + " ");
        revPrint(arr, idx - 1);
    }

    public static void recPrint(int[] arr, int idx){ // Print
        if(idx == arr.length) return;
        System.out.print(arr[idx] + " ");
        recPrint(arr, idx + 1);
    }
}