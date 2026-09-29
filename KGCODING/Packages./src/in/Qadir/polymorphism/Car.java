package in.Qadir.polymorphism;

public class Car extends Vehicle
{
    private int noOfTires;
    public Car()
    {
        this.noOfTires = 0;

    }

    public Car(int noOfTires)
    {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires()
    {
        return this.noOfTires;
    }

    @Override
    public void start()
    {
        super.getNoOfTires();

    }

    public int noOfDoors()
    {
        return 4;
    }
}