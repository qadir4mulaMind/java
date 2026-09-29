package oops;

class Fraction{
    int num;
    int deno;

    Fraction(int num, int deno){
        this.num = num;
        this.deno = deno;
        simplify();
    }

    void print(){
        System.out.println(num + " / " + deno);
    }

    void add(Fraction f){
        num = num * f.deno + deno * f.num;
        deno *= f.deno;
        simplify();
    }

    void multiply(Fraction f){
        num *= f.num;
        deno *= f.deno;
        simplify();
    }

    void divide(Fraction f){
        num *= f.deno;
        deno *= f.num;
        simplify();
    }

    void simplify(){
        boolean isNegative = (num * deno < 0) ? true : false;
        num = Math.abs(num);
        deno = Math.abs(deno);
        int gcd = hcf(num, deno);
        num = num / gcd;
        deno = deno / gcd;
        if(isNegative) num = - num;
    }

    int hcf(int a, int b){
        if(b == 0) return a;
        return hcf(b , a % b);
    }
}

public class FractionClass{
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, -7);
        f1.print();

        Fraction f2 = new Fraction(7 , 3);
        f2.print();

        f1.add(f2);
        f1.print();

        f1.multiply(f2);
        f1.print();

        f1.divide(f2);
        f2.print();

        Fraction f3 = new Fraction(50, 100);
        f3.print();
    }
}