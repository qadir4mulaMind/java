package in.qadir.multithreading.synchronised;

public class UpdaterThread extends Thread
{
    private final Counter counter;

    @Override
    public void run()
    {
        for (int i = 1; i <= 10000; i++)
        {
            counter.increment();
        }
    }

    public UpdaterThread(Counter counter)
    {

        this.counter = counter;
    }
}