package in.qadir.challange;

import java.util.List;

public class StringFilterAndConcatenation
{
    public static void main(String[] args)
    {
        List<String> strs = List.of("Prashant jain", "is teaching Java","on Kg coding", "Bad", "Ghatiya", "Ganda","Best youtube programing channnel");
        String result = strs.stream()
                .filter(str -> str.length() > 10)
                .reduce("",(a, b) ->  a + " " + b);

        System.out.println(result);
    }
}