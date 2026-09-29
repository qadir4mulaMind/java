package in.qadir.enums;

public class ChallangeTestEnum
{
    public static void main(String[] args)
    {
        System.out.println("Priting all the days of the weak.");

        for (Day value : Day.values())
        {
            System.out.println(value);
        }

        for (DayWeak day : DayWeak.values())
        {
            System.out.printf("%s : %s\n", day, day.getType());
        }
    }
}