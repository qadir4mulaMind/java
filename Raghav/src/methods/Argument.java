package methods;

public class Argument
{
    public static void sum(int a, int b, int c)
    {
        System.out.println(a + b + c);
    }
    public static int maxi(int a, int b, int c)
    {
        return (a > b) ? (a > c ? a : c) : (b > c ? b : c);
    }
    public static void main(String[] args)
    {
        int m = maxi(3, 7, 9);
        System.out.println(m);
    }
}