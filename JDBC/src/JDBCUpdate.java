import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class JDBCUpdate {
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
            String query = "UPDATE students set  age=22 where id=1";
            int update = statement.executeUpdate(query);
            System.out.println("Updated " + update + " rows.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
