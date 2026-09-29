package in.Qadir.abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
        /// Vehicle veh = new Vehicle(2); error due to abstraction
        Car car = new Car();
        car.commute();
        car.makeStartSound();
    }
}