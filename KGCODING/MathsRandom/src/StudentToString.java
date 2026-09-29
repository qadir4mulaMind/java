public class StudentToString{

    String name;
    int age;
    String rollNo;
    String house;

    public StudentToString(String name, int age,String rollNo, String house)
    {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Students Details:{Name:" + name + ", Age:"+ age + ", roll number:" + rollNo + ", House:" + house + "}";
    }

    public static void main(String[] args) {
        StudentToString student = new StudentToString("Qadir", 21, "23AI01","Sukoon");
        System.out.println(student);
    }
}