package in.Qadir.equals;

public class EqualsAndHaseCode {
    public static void main(String[] args) {
        Person per1 = new Person("Qadir", 21, "23AI01");
        Person per2 = new Person("Qadir", 21, "23AI01");
        if(per1.equals(per2))
        {
            System.out.println("Equals.");
        }
        else
        {
            System.out.println("Not Equals");
        }
    }
}