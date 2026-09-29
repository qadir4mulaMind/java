package oops;

public class ConstructorX {
    public static class Car{
        int price;
        String name;

        Car(int x, String s){
            price = x;
            name = s;
        }

        Car(String s, int x){
            price = x;
            name = s;
        }

        void print(){
            System.out.println(price + " " + name);
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car(1250, "Kia Sonet");
        c1.print();

        Car c2 = new Car(400, "BMW");
        c2.print();

        Car c3 = new Car("MG HECTOR", 900);
        c3.print();
    }
}