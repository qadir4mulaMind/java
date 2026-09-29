package basicSorting;

public class BubbleSort
{
    public static void print(int[] arr)
    {
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;
        print(arr);

        for(int i = 0; i < n - 1; i++)
        {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) break;
        }
        print(arr);


//        for(int i = 0; i < n - 1; i++)
//        {
//            for(int j = 0; j < n - i - 1; j++)
//            {
//                if(arr[j] > arr[j + 1])
//                {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        print(arr);


//        for (int i = 0; i < n - 1; i++)
//        {
//            if(arr[i] > arr[i + 1])
//            {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        print(arr);
//        for (int i = 0; i < n - 1; i++)
//        {
//            if(arr[i] > arr[i + 1])
//            {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        print(arr);
//        for (int i = 0; i < n - 1; i++)
//        {
//            if(arr[i] > arr[i + 1])
//            {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        print(arr);
//        for (int i = 0; i < n - 1; i++)
//        {
//            if(arr[i] > arr[i + 1])
//            {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        print(arr);
//        for (int i = 0; i < n - 1; i++)
//        {
//            if(arr[i] > arr[i + 1])
//            {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        print(arr);
//        for (int i = 0; i < n - 1; i++)
//        {
//            if(arr[i] > arr[i + 1])
//            {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        print(arr);
//        for (int i = 0; i < n - 1; i++)
//        {
//            if(arr[i] > arr[i + 1])
//            {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
    }

    public static class SelectionSort
    {
        public static void main(String[] args)
        {

        }
    }
}