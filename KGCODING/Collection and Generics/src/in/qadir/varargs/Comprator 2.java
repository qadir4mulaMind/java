package in.qadir.varargs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Comprator
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Bear", "loin", "Aunt");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);
    }

    public static void sortInDescending(List<String> strList)
    {
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String s, String t1)
            {
                if(strList.equals(t1)) return 0;
                else if(s.charAt(0) > t1.charAt(0)) return 1;
                else return -1;
            }
        });
    }
}