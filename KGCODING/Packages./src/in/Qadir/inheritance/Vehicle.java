package in.Qadir.inheritance;

public class Vehicle
{
    public int numberOfTires;

    public void setNumberOfTires(int tires) {
        this.numberOfTires = tires;
    }

    public void commute() {
        System.out.println("Vehicle is commuting.");
    }
}