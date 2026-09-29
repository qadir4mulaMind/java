import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to pelindrome!");
        System.out.print("Please enter the string you want to check: ");
        String str = input.next();
        System.out.println("Your string is " + ((isPalindrome(str) ? "Palindrome" : "not Palindrome.")));
    }
    public static boolean isPalindrome(String s)
    {
        if(s.length() <= 1) return true;
        int lastPos = s.length() - 1;
        if(s.charAt(0) != s.charAt(lastPos))
        {
            return false;
        }
        String newStr = s.substring(1, lastPos);
        return isPalindrome(newStr);
    }
}