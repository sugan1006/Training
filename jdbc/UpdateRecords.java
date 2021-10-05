import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
   static final String DB_URL = "jdbc:mysql://localhost/connection";
   static final String USER = "root";
   static final String PASS = "root";
   static final String QUERY = "SELECT id, name, place, age FROM Registration";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         String sql = "UPDATE Registration " +
            "SET age = 30 WHERE id in (1)";
         stmt.executeUpdate(sql);
         ResultSet rs = stmt.executeQuery(QUERY);
         while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", Name: " + rs.getString("name"));
            System.out.println(", Place: " + rs.getString("place"));
         }
         rs.close();
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }

}
output:
ID: 1, Name: ganesh, Place: chennai, Age: 30
ID: 2, Name: anil, Place: bangalore, Age: 25
ID: 3, Name: praksh, Place: thiruvarur, Age: 23
ID: 4, Name: mani, Place: tirchy, Age: 23