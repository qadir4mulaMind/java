package oops;
import java.util.*;

class Cricketer{
    final String country = "India";
    static String flag;
//    static final String dress = "Blue";  // --> This is also work
//    final static String Shoes = "White"; // -->> This is also work
    int runs;
    String name;
    double avg;

    void print(){
        System.out.println(runs + " " + name + " " + avg);
    }

    static void great(){
        System.out.println("I belive only on jassi bhai");
    }
}
 // final aur static class aur data type dono ke aage lag skte hai
public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        System.out.println(c1.country);

        Cricketer c2 = new Cricketer();
        System.out.println(c2.country);
        // c2.country = "England"; --> Can't Change

        Cricketer c3 = new Cricketer();
        c3.flag = "Tringa";
        System.out.println(c3.flag);

        Cricketer c4 = new Cricketer();
        c4.flag = "Star";
        System.out.println(c4.flag);
        System.out.println(c3.flag);

        c1.print();

        c1.great();
        c2.great();
        c3.great();
    }
}