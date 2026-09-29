import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollInsensetiveOnly {
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
            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query  = "select * from students";
            ResultSet rs = statement.executeQuery(query);
            // TYPE_FORWARD_ONLY, CONCURRENT_READ_ONLY -->  default
            System.out.println("---------------Scroll Insensitive Read Only----------------------");
            rs.last();
            System.out.print("Last Row: " + rs.getInt("id") + " | ");
            System.out.print(rs.getString("stdName") + " | ");
            System.out.println(rs.getInt("age"));

            rs.first();
            System.out.print("First Row: " + rs.getInt("id") + " | ");
            System.out.print(rs.getString("stdName") + " | ");
            System.out.println(rs.getInt("age"));

            rs.absolute(2);
            System.out.print("Random Row: " + rs.getInt("id") + " | ");
            System.out.print(rs.getString("stdName") + " | ");
            System.out.println(rs.getInt("age"));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
