	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class InsertValues {
	   static final String DB_URL = "jdbc:mysql://localhost/connection";
	   static final String USER = "root";
	   static final String PASS = "root";

	   public static void main(String[] args) {

	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	      ) {		      

	         System.out.println("Inserting records into the table");          
	         String sql = "INSERT INTO Registration VALUES (1, 'ganesh', 'chennai', 28)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO Registration VALUES (2, 'anil', 'bangalore', 25)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO Registration VALUES (3, 'praksh', 'thiruvarur', 23)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO Registration VALUES(4, 'mani', 'tirchy', 23)";
	         stmt.executeUpdate(sql);
	         System.out.println("Inserted records into the table");   	  
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }

}
output:
Inserting records into the table
Inserted records into the table