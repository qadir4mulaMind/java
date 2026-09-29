package string;

import java.util.Collections;

public class ReverseStringBuilder
{
    public static void main(String[] args)
    {
        String s = "Divesh";
        StringBuilder sb = new StringBuilder(s);
        System.out.println();
        sb.append("Jain");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        int i = 0, j = sb.length() - 1;
        while(i <= j)
        {
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i, temp2);
            sb.setCharAt(j, temp1);
            i++;
            j--;
        }
        System.out.println(sb);
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.insert(1, "i");
        System.out.println(sb);
        sb.delete(3, 5);
        System.out.println(sb);
        String x = "Aaditya";
        StringBuilder s1 = new StringBuilder(x);
        s1.reverse();
        x = s1.toString();
        System.out.println(x);
    }
}