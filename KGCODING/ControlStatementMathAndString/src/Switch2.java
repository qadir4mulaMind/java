import java.util.Scanner;
public class Switch2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the day predicter.");
        System.out.print("Enter day number: ");
        int day = input.nextInt();
        String result = switch(day)
        {
            case 1 -> "Today is Monday.";
            case 2 -> "Today is Tuesday.";
            case 3 -> "Today is Wednesday.";
            case 4 -> "Today is Thrusday.";
            case 5 -> "Today is Friday.";
            case 6, 7 -> "Today is holiday";
            default -> "Oh no! Please enter day between 1 - 7";
        };
        System.out.println(result);
    }
}