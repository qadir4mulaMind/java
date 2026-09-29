package array2D;

import java.util.ArrayList;

public class ArrayLists
{
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(4);
        a.add(7);
        a.add(22);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(4);b.add(7);
        b.add(9);
        b.add(12);

        ArrayList<Integer> c = new ArrayList<>();
        c.add(13);
        c.add(34);
        c.add(17);
        c.add(42);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);

        //System.out.println(arr);

//        for(int i = 0; i < arr.size(); i++)
//        {
//            for(int j = 0; j < arr.get(i).size(); j++) System.out.print(arr.get(i).get(j) + " ");
//            System.out.println();
//        }

        arr.add(new ArrayList<>());
        arr.get(arr.size() - 1).add(10);
        arr.get(arr.size() - 1).add(29);
        for(ArrayList<Integer> list : arr)
        {
            for(int ele : list) System.out.print(ele + " ");
            System.out.println();
        }
    }
}