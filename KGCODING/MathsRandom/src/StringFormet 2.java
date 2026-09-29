public class StringFormet {
    public static void main(String[] args) {
        String name = "Sandeep";
        int marks = 45765;
        System.out.println("Hello " + name + " your marks is " + marks);
        System.out.printf("Hello %6S, your marks is %d\n", name, marks);
        System.out.printf("Hello %S, your marks is %8d\n", name, marks);
        System.out.printf("Hello %6S, your marks is %08d\n", name, marks);
        System.out.printf("Hello %6S, your marks is %0,8d\n", name, marks);
    }
}