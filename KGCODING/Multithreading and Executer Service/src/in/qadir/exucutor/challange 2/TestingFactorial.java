package in.qadir.exucutor.challange;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestingFactorial
{
    public static void main(String[] args)
    {
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Future<Integer>> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++)
        {
            FactorialCalculator task = new FactorialCalculator(i);
            list.add(service.submit(task));
        }

        for (int i = 0; i < list.size(); i++)
        {
            try
            {
                System.out.printf("Factorial of %d is %d\n", i + 1, list.get(i).get());
            }
            catch (ExecutionException | InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        service.shutdown();
        try
        {
            if (!service.awaitTermination(10, TimeUnit.SECONDS))
            {
                service.shutdownNow();
            }
        }
        catch (InterruptedException e)
        {
            service.shutdownNow();
        }
    }
}