package in.Qadir.cal;

public class Calculator
{
    public int add(int f, int s)
    {
        return f + s;
    }

    public int add(int f, int s, int t)
    {
        return f + s + t;
    }

    public double add(double f, double  s)
    {
        return f + s;
    }
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 6));
        System.out.println(calc.add(1,2, 3));
        System.out.println(calc.add(2.4, 5.8));
    }
}