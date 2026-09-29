package in.qadir.challange;

import java.util.List;
import java.util.function.Consumer;

public class StreamTesting
{
    public static void main(String[] args)
    {
        List<String> names = List.of("Prashant", "Qadir", "Chahat", "Husain");
        names.stream().forEach(name -> System.out.println(name));
    }
}