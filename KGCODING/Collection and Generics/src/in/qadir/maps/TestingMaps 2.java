package in.qadir.maps;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps
{
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("Prashant", 34);
        map.put("Sanchit", 10);
        map.put("Ram", 100);
        map.put("Ravi", 94);
        map.put("Pawan", 97);

        System.out.println(map.size());
        System.out.println(map.get("Prashant"));
        System.out.println(map.containsKey("Ram"));
        System.out.println(map.containsKey("Geeta"));
        System.out.println(map.remove("Ram"));
        System.out.println(map.size());

        for (String key : map.keySet())
        {
            System.out.printf("%s : %s\n", key, map.get(key));
        }
    }
}