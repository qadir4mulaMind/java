package in.Knowledgegate;

import in.GetterSetter.Car;
public class GetterTest
{
    public static void main(String[] args)
    {
        Car car = new Car("Black", "Maruti",6, 1500);
        car.setColor();
        System.out.printf("%s %s.\n",car.getColor(),car.getModel());
    }
}