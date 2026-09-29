package in.qadir.multithreading.challanges;

public class Main
{
    public static void main(String[] args)
    {
        Hellothread t1 = new Hellothread(1);
        Hellothread t2 = new Hellothread(2);

        t1.start();
        t2.start();
    }
}