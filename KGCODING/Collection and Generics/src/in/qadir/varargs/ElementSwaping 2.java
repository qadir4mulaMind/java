package in.qadir.varargs;

import java.util.Arrays;
import java.util.List;

public class ElementSwaping
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(list);
        swap(list, 2, 7);
        System.out.println(list);

    }
    public static void  swap(List<Integer> l , int x, int y)
    {
        int swap = l.get(x);
        l.set(x, l.get(y));
        l.set(y, swap);
    }

}