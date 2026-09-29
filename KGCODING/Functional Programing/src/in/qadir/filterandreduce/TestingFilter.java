package in.qadir.filterandreduce;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "Banana", "mango", "cherry", "date");

        System.out.println(fruits.size());

        System.out.println("Printing fruits normally.......");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nPrinting Fruits using streams........");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("\nPrinting Fruits using filter........");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit));
    }
}