package org.example;

public class Student {

    public Course course; // Course type ka object

    public Student() {
    }

    public Student(Course course) {
        this.course = course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void study(){
        int start = course.enroll();

        if(start >= 1){
            System.out.println("Journey Started.............");
        }else {
            System.out.println("Payment failed");
        }
    }
}
