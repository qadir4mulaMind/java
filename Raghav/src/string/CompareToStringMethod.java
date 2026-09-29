package string;

public class CompareToStringMethod
{
    public static int compareTo(String a, String b) {
        int m = a.length(), n = b.length();
        int minLen = Math.min(m, n);

        // Compare character by character
        for (int i = 0; i < minLen; i++)
        {
            if (a.charAt(i) != b.charAt(i))
            {
                return a.charAt(i) - b.charAt(i); // difference of first unmatched char
            }
        }
        // If all chars match up to minLen, then shorter string is "smaller"
        return m - n;
    }
    public static void main(String[] args)
    {
        String a = "harmeet";
        String b = "har";
        System.out.println(a.compareTo(b));
        String c = "harshita";
        System.out.println(b.compareTo(c));
        System.out.println(compareTo(a, b));
        String x = "Ajay";
        String y = "Ajay";
        System.out.println(x.compareTo(y));
    }
}