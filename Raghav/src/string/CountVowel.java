package string;

import java.util.Scanner;

public class CountVowel
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = input.next();
         int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') count++;
        }
        System.out.println("The vowel in string is: " + count);
    }
}