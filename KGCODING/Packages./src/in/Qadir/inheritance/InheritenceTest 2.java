package in.Qadir.inheritance;

public class InheritenceTest
{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());


        TwoWheller two = new TwoWheller();
        two.commute();
        two.balance();

        MotorCycle mot = new MotorCycle();
        mot.commute();
        mot.balance();
        mot.start();
    }
}