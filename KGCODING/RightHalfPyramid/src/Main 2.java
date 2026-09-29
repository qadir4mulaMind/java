public class Main
{
    public static void main(String[] args)
    {
        System.out.printf("Hello and welcome!\n");
        for (int i = 5; i >= 1; i--)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}