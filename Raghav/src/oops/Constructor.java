package oops;

public class Constructor {
    public static class Car{
        int seats;
        String name;
        double length;

        Car(){ // Default constructor
            System.out.println("This is a default constructor");
        }

        Car(int x, String s, double d){
            seats = x;
            name = s;
            length = d;
        }

        void print(){
            System.out.println(seats + " " + name + " " + length);
        }
    }
//    public static int max(int a, int b){
//        return Math.max(a, b);
//    }
//       *** Method Overloading
//    public static int max(int a, int b, int c){
//        return Math.max(a, Math.max(b, c));
//    }
    public static void main(String[] args) {
        Car c1 = new Car();

        Car c2 = new Car(5, "Kia Sonet", 3.9);
        c2.print();

        Car c3 = new Car(7, "Breaza", 5);
        c3.print();

        Car c4 = new Car();
        c4.name = "honda City";
        c4.print();

//        System.out.println(max(3,4));
//
//        System.out.println(max(6, 9, 2));
    }
}