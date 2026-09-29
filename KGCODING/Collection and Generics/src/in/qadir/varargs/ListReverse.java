package in.qadir.varargs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListReverse
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 76);
        System.out.println(list);
        reverseList(list);
        System.out.println(list);
    }
    public static void reverseList(List<Integer> l)
    {
        // Collections.reverse(l); Alternative
        for (int i = 0; i < l.size() / 2; i++)
        {
            ElementSwaping.swap(l, i, l.size() - 1 - i);
        }
    }
}