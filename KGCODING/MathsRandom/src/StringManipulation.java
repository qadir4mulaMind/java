import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first string: ");
        String str1 = input.next();
        System.out.print("Please enter second string: ");
        String str2 = input.next();

        String result = concatinateAndUpper(str1, str2);
        System.out.println("Final Result: " + result);
    }

    public static String concatinateAndUpper(String s1, String s2) {
        String combined = s1 + s2;
        String result = "";

        for (int i = 0; i < combined.length(); i++) {
            char ch = combined.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); // convert to uppercase
            }
            result += ch;
        }

        return result;
    }
}