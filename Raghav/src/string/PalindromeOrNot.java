package string;

import java.util.Scanner;

public class PalindromeOrNot
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = input.next();
        int i = 0, j = str.length() - 1;
        boolean flag = true;
        while(i < j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(flag == false ? "String is not Palindrome." : "String is Palindrome.");
    }
}