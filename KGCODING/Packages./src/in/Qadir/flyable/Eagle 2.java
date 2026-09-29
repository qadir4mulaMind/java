package in.Qadir.flyable;

public class Eagle extends Bird
{
    @Override
    public void fly()
    {
        System.out.println("Eagle is flying..");
    }

    public Eagle()
    {
        super("Eagle");
    }

}