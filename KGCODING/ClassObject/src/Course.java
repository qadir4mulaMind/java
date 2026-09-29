public class Course {
    String courseName;
    int enrollment;
    static int maxCapacity = 100;
    String[] enrolledStudents = new String[maxCapacity];

    Course(String courseName)
    {
        this.courseName = courseName;
        this.enrollment = 0;
        this.enrolledStudents = new String[maxCapacity];
    }
    {
        System.out.println("Don't worry i am here.");
    }

    static void setMaximumCapacity(int maxCapacity)
    {
        Course.maxCapacity = maxCapacity;
    }

    void enrolledStudent(String studentName)
    {
        enrolledStudents[enrollment] = studentName;
        enrollment++;
    }

    void unenrolledStudent(String studentName)
    {
        System.out.println("Student removed.");
    }
    public static void main(String[] args) {
        Course dataScience = new Course("nlp");
    }
}