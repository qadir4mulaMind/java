package oops;

public class PassingClassesToMethod {
    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        int torque;
        void print(){
            System.out.println(seats + " " + name + " " + length + " " + type + " " + torque);
        }
    }
    public static void main(String[] args) {
        Student s = new Student();
        Car c = new Car();
        c.length = 3.99;
        c.name = "Kia Sonet";
        c.seats = 5;
        c.torque = 178;
        c.type = "SUV";

        System.out.println(c.seats);
        change(c);

        System.out.println(c.seats);

        c.print();
    }
    private static void change(Car x){
        x.seats = 4;
    }
}