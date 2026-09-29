package string;

public class SubStringOfString
{
    public static void print(String s)
    {
        for(int i = 0; i < s.length(); i++)
        {
            for(int j = i + 1; j <= s.length(); j++) System.out.print(s.substring(i, j) + " ");
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        String x = "Bhakti";
        String s = "Gopi";
        System.out.println(s.substring(0, s.length())); // 1 to 4
        print(x);
    }
}