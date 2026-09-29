package in.qadir.challange;

import java.util.Comparator;
import java.util.List;

public class TestSorting
{
    public static void main(String[] args)
    {
        List<Employee> emp = List.of(
                new Employee("Prashant",700),
                new Employee("Sanchit",200),
                new Employee("Husain",900),
                new Employee("Qadir",60)

        );

        emp.stream()
                .sorted((empl, empl1) -> Integer.compare(empl.getSalary(), empl1.getSalary()))
                .forEach(System.out::println);
    }
}