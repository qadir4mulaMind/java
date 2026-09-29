package in.Qadir.abstraction;

public abstract class Vehicle implements Transport
{
    private int numberOfTires;

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public abstract void makeStartSound();

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }
    @Override
    public void getSetGo()
    {
        System.out.println("Go into place.");
    }


    public Vehicle(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public void commute()
    {
        System.out.println("Going..........");
    }

    public static void main(String[] args) {

    }
}