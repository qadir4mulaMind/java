package in.qadir.multithreading.threadClass;

public class ThirdTask extends Thread
{
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++)
        {
            System.out.printf("%d# ", i);
        }
        System.out.printf("\n %s\n # task is complete\n", Thread.currentThread().getName());
    }

    public static class FirstTask extends Thread
    {
        @Override
        public void run() {
            for (int i = 1; i <= 1000; i++)
            {
                System.out.printf("%d* ", i);
            }
            System.out.printf("\n %s\n * task is complete\n", Thread.currentThread().getName());
        }
    }
}