package in.qadir.challange;

import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct
{
    public static void main(String[] args)
    {
        List<Integer> numbers = List.of(1, 5, 3, 4, 5, 7, 6, 7, 2, 6);
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(distinctNumbers);
    }
}