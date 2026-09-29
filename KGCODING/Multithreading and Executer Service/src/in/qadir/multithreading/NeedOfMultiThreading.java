package in.qadir.multithreading;

public class NeedOfMultiThreading
{
    public static void main(String[] args)
    {
        long startTime =  System.currentTimeMillis();
        // First task
        for (int i = 1; i <= 1000; i++)
        {
            System.out.printf("%s* ", i);
        }
        System.out.println("\n * task is complete");
        //Second task
        for (int i = 1; i <= 1000; i++)
        {
            System.out.printf("%s$ ", i);
        }
        System.out.println("\n $ task is complete");
        //Third task
        for (int i = 1; i <= 1000; i++)
        {
            System.out.printf("%s# ", i);
        }
        System.out.println("\n # task is complete");
        long endTime = System.currentTimeMillis();

        System.out.printf("The total time taken to complet the execution of program is:  %d\n", endTime - startTime );
    }
}