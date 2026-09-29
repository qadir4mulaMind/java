package in.qadir.challange;

import java.util.List;

public class FilterOdd
{
    public static void main(String[] args)
    {
        List<Integer> num = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        num.stream()
                .filter(numb -> numb % 2 != 0)
                .forEach(numb -> System.out.println(numb));
    }
}