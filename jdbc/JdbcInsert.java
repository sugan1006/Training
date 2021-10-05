import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement; 

public class ProductDetails {   

        static final String DB_URL = "jdbc:mysql://localhost/db";
        static final String USER = "root";
        static final String PASS = "root";      
        
        public static void main(String[] args) {
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                    Statement stmt = conn.createStatement();) {
                String QUERY = "INSERT INTO connect VALUES( 3, 'electronics', 'delhi')";
                stmt.executeUpdate(QUERY);
                System.out.println("Inserted records in the table");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }


output:
Inserted records in the table


mysql workbench DB:result
1	appliances	chennai
2	accessories	bangalore
3	electronics	delhi