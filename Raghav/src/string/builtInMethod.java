package string;

import java.util.Scanner;

public class builtInMethod
{
    public static void main(String[] args)
    {
        String s = "harsita";
        System.out.println(s.indexOf('a')); // return first occurence
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.indexOf('u'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("hars"));
        System.out.println(s.contains("ars"));
        if(s.contains("hars")) System.out.println("happy");
        String a = "Geetangli";
        String b = "Priya";
        System.out.println(a.concat(b));
        System.out.println(a);
        a = a.concat(b);
        System.out.println(a);
        String x = "bhakti";
        x = x + " hi bhaitiji";
        System.out.println(x);
        x += 10;
        System.out.println(x);
        x += '\n';
        System.out.println(x);
        x += 'n';
        System.out.println(x);
        System.out.println("raghav" + 10 + 20);
        System.out.println("Raghav" + (10 + 20));
        System.out.println('A' + 31 + "seema");
        String k = " ";
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        k += n;
        k = Integer.toString(n);
        System.out.println(k);

    }
}