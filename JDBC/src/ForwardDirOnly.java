import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class ForwardDirOnly {
    /*
    1. Load the driver class.
    2. Get connection from db;
    3. Create statement.
    4. Execute query.
    * */
    static void main() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB", "root", "root");
            Statement statement = con.createStatement();
            String query  = "select * from students";
            ResultSet rs = statement.executeQuery(query);
            System.out.println("---------------Read Data----------------------");
            while (rs.next()){
                System.out.println(
                        rs.getInt("id") + "       | " +
                                rs.getString("stdName") + "        | " +
                                rs.getInt("age")
                );
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
