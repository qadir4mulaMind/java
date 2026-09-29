package in.KGCoding;

public class AcessTest
{
    public static void main(String[] args)
    {
        Car car = new Car();
        car.color = "White";
        car.model = "swift";
        System.out.println(car);
        Car newCar = new Car("Black","bmw", 1, 1200);
        System.out.println(newCar);

    }
}