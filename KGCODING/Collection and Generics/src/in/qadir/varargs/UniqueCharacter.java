package in.qadir.varargs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UniqueCharacter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Set<Character> unique = new HashSet<>();
        System.out.print("Please Enter your String: ");
        String str = input.next();

        for (char c : str.toCharArray())
        {
            unique.add(c);
        }
        System.out.printf("Your string has %d unique charaters", unique.size());
    }
}