import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class JDBCDeleteDemo {
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
            Statement statement = con.createStatement();
            String query = "DELETE  From students where id=2";
            int delete = statement.executeUpdate(query);
            System.out.println("Deleted " + delete + " rows.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
