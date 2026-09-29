public class Main
{
    public static void main(String[] args)
    {
        System.out.printf("Hello and welcome!\n");
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}