package oops;

import org.w3c.dom.ls.LSOutput;

public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhou Bhou");
        }
    }

    public static class Cat{
        void speak(){
            System.out.println("Meuo Meuo");
        }
    }

    public static class Sher{
        void speak(){
            System.out.println("Grrrrrrrrrrrrrr");
        }
    }

    public static class Pikachu{
        void speak(){
            System.out.println("Pika Pika");
        }
    }

    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        Human h = new Human();
        Pikachu p = new Pikachu();
        Dog d = new Dog();
        Cat c = new Cat();

        d.speak();
        p.speak();
        c.speak();
        h.speak();
    }
}