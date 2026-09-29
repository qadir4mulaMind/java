package in.qadir.varargs;import java.util.*;

public class CustomComprator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana", "Apple", "Mango", "Grapes");

        // Custom comparator for descending order
        Collections.sort(list, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s2.compareTo(s1); // reverse order
            }
        });

        // Print sorted list
        for (String item : list) {
            System.out.println(item);
        }
    }
}