import java.util.Scanner;

public class Score
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter marks: ");
        int marks = input.nextInt();
        System.out.println("The score is " + grade(marks));
    }

    public static String grade(int m)
    {
        return m >= 80 ? "High" : m >= 50 && m <80 ? "Modrate" : "Low";
    }
}