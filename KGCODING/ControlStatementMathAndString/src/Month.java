import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Please enter month number: ");
        int month = input.nextInt();
        System.out.println(monthName(month));
    }
    public static String monthName(int n)
    {
        String x = switch(n)
        {
            case 1 -> "Month name is January";
            case 2 -> "Month name is Feberuary";
            case 3 -> "Month name is March";
            case 4 -> "Month name is April";
            case 5 -> "Month name is May";
            case 6 -> "Month name is June";
            case 7 -> "Month name is July";
            case 8 -> "Month name is August";
            case 9 -> "Month name is September";
            case 10 -> "Month name is October";
            case 11 -> "Month name is November";
            case 12 -> "Month name is December";
            default -> "Oh no!, please enter valid month number.";
        };
        return x;
    }
}