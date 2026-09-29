package in.qadir.wraper;

public class TestingWraper
{
    public static void main(String[] args)
    {
        Integer first = Integer.valueOf("55");
        Integer x = Integer.valueOf(55);
        Integer y = 7; // AutoBoxing
        System.out.println(y);
        int b = y; // unboxing
        //int a = null; error
        Integer a = null; // working.

    }
}