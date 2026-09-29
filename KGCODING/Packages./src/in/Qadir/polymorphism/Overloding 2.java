package in.Qadir.polymorphism;

public class Overloding
{
    public int add(int a, int b)
    {
        return a + b;
    }
    public int add(int a, int b, int c, int d)
    {
        return a + b + c + d;
    }

    public String add(String a, String b)
    {
        return a + b;
    }
    public static void main(String[] args)
    {
        Overloding overload = new Overloding();
        System.out.println(overload.add(4, 5));
        System.out.println(overload.add(1, 2, 3, 4));
        System.out.println(overload.add("Abdul"," Qadir"));
    }
}