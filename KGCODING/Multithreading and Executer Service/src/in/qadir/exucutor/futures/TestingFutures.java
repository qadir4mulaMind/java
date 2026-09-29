package in.qadir.exucutor.futures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFutures
{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);

        FetchName task1 = new FetchName("Prashant");
        FetchName task2= new FetchName("Sanchit");
        FetchName task3 = new FetchName("Arjun");
        FetchName task4 = new FetchName("Ali");

        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);
        Future<String> name4 = service.submit(task4);

        System.out.printf("Full Name is %s\n",name1.get());
        System.out.printf("Full Name is %s\n",name2.get());
        System.out.printf("Full Name is %s\n",name3.get());
        System.out.printf("Full Name is %s\n",name4.get());

    }
}