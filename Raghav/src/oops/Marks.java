package oops;

public class Marks {
    public static class StudentData{
        String name;
        int rno;
        int size;
        int[] marks;

        StudentData(int s){
            marks = new int[s];
        }

        StudentData(int[] s){
            marks = s;
        }

        StudentData(int rno, int size){
            size = size;
            rno = rno;
        }

        StudentData(int rno, String name, int size){
            rno = rno;
            name = name;
            size = size;
            System.out.println(rno + " " + name + " " + size);
        }

        StudentData(int rno, String name){
            this.rno = rno;
            this.name = name;
        }

        void print(){
            System.out.println(rno + " " + size + " " + name);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 4, 6};
        StudentData sd1 = new StudentData(4);
        StudentData sd2 = new StudentData(2);

        sd1.marks[0] = 89;
        sd1.marks[1] = 83;
        sd1.marks[2] = 81;
        sd1.marks[3] = 88;

        //sd2.marks[2] = 76;

        StudentData sd3 = new StudentData(arr);
        sd3.marks[0] = 43;
        System.out.println(arr[0]);

        StudentData sd4 = new StudentData(56, 7);
        sd4.print();

        StudentData sd5 = new StudentData(56, "Anuj");
        sd5.print();

        StudentData sd6 = new StudentData(67, "Qadir", 5);
    }
}