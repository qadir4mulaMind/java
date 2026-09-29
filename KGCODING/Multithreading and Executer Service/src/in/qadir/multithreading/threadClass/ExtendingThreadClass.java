package in.qadir.multithreading.threadClass;


public class ExtendingThreadClass
{
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();

        ThirdTask.FirstTask t1 = new ThirdTask.FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        System.out.println("\nStarting First thread");
        t1.start();
        System.out.println("\nStarting second thread");
        t2.start();
        System.out.println("\nStarting third thread");
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.printf("\n%s\n The total time taken to complet the execution of program is:  %d\n", Thread.currentThread().getName(), endTime - startTime );

    }
}