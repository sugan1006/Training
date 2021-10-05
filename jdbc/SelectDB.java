	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class SelectDb {
	   static final String DB_URL = "jdbc:mysql://localhost/connection";
	   static final String USER = "root";
	   static final String PASS = "root";

	   public static void main(String[] args) {
	      System.out.println("Connecting to a selected database");

	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {		      
	         System.out.println("Connected database successfully");  
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }

}
output:
Connecting to a selected database
Connected database successfully