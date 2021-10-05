
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class CreateTable {
	   static final String DB_URL = "jdbc:mysql://localhost/connection";
	   static final String USER = "root";
	   static final String PASS = "root";

	   public static void main(String[] args) {

	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	      ) {		      
	          String sql = "CREATE TABLE REGISTRATION " +
	                   "(id INTEGER not NULL, " +
	                   " name VARCHAR(255), " + 
	                   " place VARCHAR(255), " + 
	                   " age INTEGER, " + 
	                   " PRIMARY KEY ( id ))"; 

	         stmt.executeUpdate(sql);
	         System.out.println("Created table in given database");   	  
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }

}
output:
Created table in given database