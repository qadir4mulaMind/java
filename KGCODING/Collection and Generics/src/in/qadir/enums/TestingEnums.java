package in.qadir.enums;

public class TestingEnums
{

    public static void main(String[] args)
    {
        TrafficLight colors = TrafficLight.RED;

        Grade g = Grade.A;

        Grade x = Grade.valueOf("D");
        for (Grade value : Grade.values())
        {
            System.out.println(value);
        }
    }
}