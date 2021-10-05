import java.sql.*;
public class JdbcConnection {

   static final String DB_URL = "jdbc:mysql://localhost:3306/connect";
   static final String USER = "root";
   static final String PASS = "root";
   static final String QUERY = "SELECT id, firstname, lastname, age, place FROM jdbc";
   

   public static void main(String[] args) {
      // Open a connection
      try(Connection connect = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = connect.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);) {
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.print("Id: " + rs.getInt("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First: " + rs.getString("firstname"));
            System.out.println(", Last: " + rs.getString("lastname"));
            System.out.println(", Place: " + rs.getString("place"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}  

output:
Id: 1, Age: 23, First: sugan, Last: p, Place: vellore
Id: 2, Age: 23, First: jp, Last: m, Place: thiruvarur
Id: 3, Age: 23, First: mani, Last: k, Place: trichy