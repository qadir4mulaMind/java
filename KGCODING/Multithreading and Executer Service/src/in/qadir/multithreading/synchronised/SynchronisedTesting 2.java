package in.qadir.multithreading.synchronised;

public class SynchronisedTesting
{
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        Counter counter = new Counter();
        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);

        try
        {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        }
        catch(Exception e)
        {
            System.out.printf("Thread intrupt: %s\n", e.getMessage());
        }
        long endTime = System.currentTimeMillis();

        System.out.printf("Final conuter value: %d and time taken %d", counter.getCount(), endTime - startTime);
    }
}