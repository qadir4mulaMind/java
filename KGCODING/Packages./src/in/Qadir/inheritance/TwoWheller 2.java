package in.Qadir.inheritance;

public class TwoWheller extends Vehicle
{
    public TwoWheller()
    {
        setNumberOfTires(2);
        numberOfTires = 4;
    }

    public void balance()
    {
        System.out.println("I am balancing on two tires.");
    }
}