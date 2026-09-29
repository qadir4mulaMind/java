package in.qadir.enums;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CntryMap
{
    public static void main(String[] args)
    {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("Bharat", "New Delhi");
        countryMap.put("China", "Beiging");
        countryMap.put("Pakistan", "Islamabaad");
        countryMap.put("ShriLanka", "Columbo");
        countryMap.put("Bangladesh", "Dhaka");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your country name: ");
        String country = input.next();

        if(countryMap.containsKey(country)) System.out.printf("Capital of %s : %s\n",country, countryMap.get(country) );
        else System.out.println("Sorry we don't know the capital.");
    }
}