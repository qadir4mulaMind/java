package in.qadir.multithreading.join;

import in.qadir.multithreading.runnable.PrintTask;

public class TestingJoin
{
    public static void main(String[] args) throws InterruptedException
    {
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        Thread t1 = new Thread(p1);
        System.out.println("\nThread 1 started");
        t1.start();
        Thread t2 = new Thread(p2);
        System.out.println("\nThread 2 started");
        t2.start();
        t1.join();
        Thread t3 = new Thread(p3);
        System.out.println("\nThread 3 started");
        t3.start();
    }
}