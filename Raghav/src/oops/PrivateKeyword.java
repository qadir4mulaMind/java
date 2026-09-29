package oops;

import java.util.Scanner;

class Students{
    String name;
    private int rno;
    double cgpa;

    private void print(){
        System.out.println(name + " " + rno + " " + cgpa);
    }

    int  getRno(){
        return rno; // getter
    }

    void setRno(int x){
        rno = x;
    }

//    private void print(){
//        System.out.println(name + " " + rno + " " + cgpa);
//    }
//
//    void p(){
//        print();
//    }
}

public class PrivateKeyword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Students s1 = new Students();
        // s1.p();

        s1.cgpa = 7.8;
        s1.name = "Ali";

        // s1.p();

        System.out.println(s1.getRno());

        s1.setRno(34);

        System.out.println(s1.getRno());

        StringBuilder sb = new StringBuilder(input.nextLine());
        System.out.println(sb);
    }
}