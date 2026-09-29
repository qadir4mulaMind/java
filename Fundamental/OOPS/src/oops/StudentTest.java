/**
 * @author Abdul Qadir
 * @date 29 Nov 2025
 * @time 7:39:42 pm
 */
package oops;
class Student{
    public String rollNo;
    public String name;
    public String course;
    double m1, m2, m3;
    
    public double total(){
        return m1 + m2 + m3;
    }
    
    public double avg(){
        return total() / 3;
    }
    
    public char grade(){
        if(avg() >= 90.0){
            return 'A';
        }
        else if(avg() >= 70.0){
            return 'B';
        }
        else if(avg() >= 40.0){
            return 'C';
        }
        else return 'F';
    }
    public void showBioData(){
        System.out.println("Name: " + name + ", total marks: " + total() + ", Average: " + avg() + ", Grade: " + grade());
    }
}

public class StudentTest {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.rollNo = "2AI01";
        s1.name = "Abdul Qadir";
        s1.course = "DataScience2023";
        s1.m1 = 56.4;
        s1.m2 = 67.1;
        s1.m3 = 48.6;
        s1.showBioData();
        
        System.out.println();
        Student s2 = new Student();
        s2.rollNo = "2AI54";
        s2.name = "Sumit";
        s2.course = "DataScience2023";
        s2.m1 = 96.4;
        s2.m2 = 87.1;
        s2.m3 = 98.6;
        s2.showBioData();
    }
    
}