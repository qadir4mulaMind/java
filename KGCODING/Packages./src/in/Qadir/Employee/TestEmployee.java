package in.Qadir.Employee;

public class TestEmployee
{
    public static void main(String[] args)
    {
        Employ emp = new Employ("Abdul Qadir", 21, 300);
        System.out.println(emp.employeDetails());
        emp.setName("Chahat");
        System.out.println(emp.employeDetails() );
    }
}