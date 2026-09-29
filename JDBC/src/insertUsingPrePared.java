import java.sql.*;
import java.util.Scanner;

public class insertUsingPrePared {
    /*
    1. Load the driver class.
    2. Get connection from db;
    3. Create statement.
    4. Execute query.
    * */
    static void main() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB", "root", "MacUser@2026#Secure");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter id: ");
            int i = sc.nextInt();
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter age: ");
            int a = sc.nextInt();
            String query = "INSERT INTO students (id, stdName, age) values (?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1,i);
            statement.setString(2, name);
            statement.setInt(3, a);
            statement.executeUpdate();
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

