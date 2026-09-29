package oops;

class ComplexNumber{
    int x,y;

    ComplexNumber(int x, int y){
        this.x = x;
        this.y = y;
    }

    void print(){
        if(y >= 0) System.out.println(x + " + " + y + "i");
        else System.out.println(x + " - " + (-y) + "i");
    }

    void add(ComplexNumber z) {
        x += z.x;
        y += z.y;
    }

    void multiply(ComplexNumber z) {
        x = x * z.x - y * z.y;
        y = x * z.y + y * z.x;
    }

    void division(ComplexNumber z) {
        double denominator = z.x * z.x + z.y * z.y;

        if (denominator == 0) {
            System.out.println("Division by zero is not possible!");
            return;
        }

        double realPart = (this.x * z.x + this.y * z.y) / denominator;
        double imagPart = (this.y * z.x - this.x * z.y) / denominator;

        this.x = (int)realPart;
        this.y = (int)imagPart;
    }
}

public class ComplexClass {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2, -5);
        z1.print();

        ComplexNumber z2 = new ComplexNumber(3, 5);
        z2.print();

        z1.add(z2);

        z2.print();

        z1.print();
        z2.print();

        z2.multiply(z1);
        z2.print();
        z1.print();

        z2.division(z1);
        z2.print();
    }
}