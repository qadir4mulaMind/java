public class Driver
{
    public static void main(String[] args)
    {
        Car swift = new Car("Red");
        Car thar = new Car();
        thar = null;
        //swift.addFuel(6);
        swift.start().drive();
        System.out.println(swift.color);
    }
}