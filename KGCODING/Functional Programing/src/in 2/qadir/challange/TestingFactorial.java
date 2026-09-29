package in.qadir.challange;

import java.util.stream.IntStream;

public class TestingFactorial
{
    public static  long factorial(int num)
    {
        if(num == 0 || num == 1) return 1;
        long fact = 1;
        for(int i = 2; i <= num; i++)
        {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args)
    {
        System.out.println("factorial using two ways ");
        System.out.println(factorial(5));
        int number = 5;
        IntStream.rangeClosed(2, number)
                .reduce((a, b) -> a * b)
                .ifPresent(System.out::println);
    }
}