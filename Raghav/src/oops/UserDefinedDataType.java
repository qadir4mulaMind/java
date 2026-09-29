package oops;

import java.util.Scanner;

public class UserDefinedDataType {
    public static class Student{
        String name;
        int rno;
        double cgpa;

        void print(){
            System.out.println(name + " " + rno + " " + cgpa);
        }
    }
    public static void main(String[] args){
        int x = 30;
        double d = 4.6;
        //"Raghav" 25 175.6 'A'
        Scanner input = new Scanner(System.in);

        Student s1 = new Student();
        s1.name = "Khusi";
        s1.rno = 23;
        s1.cgpa = 8.5;

        Student s2 = new Student();
        s2.name = "Lavish";
        s2.rno = 33;
        s2.cgpa = 2.2;

        Student s3 = new Student();
        s3.name = "Ananga";
        s3.rno = 13;
        s3.cgpa = input.nextDouble();

        System.out.println(s1.name + " " + s1.rno + " " + s1.cgpa);
        System.out.println(s2.name + " " + s2.rno + " " + s2.cgpa);
        System.out.println(s3.name + " " + s3.rno + " " + s3.cgpa);

        s2.cgpa = 9.8;
        System.out.println(s2.cgpa);

        s1.print();
        s2.print();
        s3.print();

        System.out.println();

        print(s1);
        print(s2);
        print(s3);
    }
    public static void print(Student s){
        System.out.println(s.name + " " + s.rno + " " + s.cgpa);
    }
}