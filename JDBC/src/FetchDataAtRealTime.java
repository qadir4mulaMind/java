import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchDataAtRealTime {
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
            System.out.println("---------------Fetch Data in live update mode----------------------");
            Thread.sleep(20000);
            rs.beforeFirst();
            while (rs.next()){
                System.out.println(
                        rs.getInt("id") + "       | " +
                                rs.getString("stdName") + "        | " +
                                rs.getInt("age")
                );
            }
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
