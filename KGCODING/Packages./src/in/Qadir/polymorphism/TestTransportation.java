package in.Qadir.polymorphism;

public class TestTransportation
{
    public static void main(String[] args) {
        Car c = new Car();
        // Vehicle v = new Vehicle();

        Vehicle vCar = new Car();
        //Car cVehicle = (Car)new Vehicle(); Eroor in code

        Object ob = new Car();
        // Object ref = new Vehicle();

//        castTest(v);
//        castTest(c);

    }

    private static void castTest(Vehicle veh)
    {
//        Car cVehicle = (Car) veh;
//        ((Car) veh).noOfDoors();
//        cVehicle.start();
//        cVehicle.noOfDoors();
          veh.start();
    }
}