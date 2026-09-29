package in.qadir.varargs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Frequency
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2, 1, 3, 4, 5, 1, 3, 1, 6, 1);
        System.out.println(Collections.frequency(list,1));
    }
}