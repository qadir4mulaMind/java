package Loops;

public class Ascii2
{
    public static void main(String[] args)
    {
        for(char i = 'A'; i <= 'z'; i++)
        {
            System.out.print(i + " : ");
            System.out.println((int)i);
        }
    }
}