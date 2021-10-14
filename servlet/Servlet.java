html file

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<center>
<form method=get action=EOCheck>
Enter No:<input type=text name=t1>
<br><br>
<input type=submit value="Check Even/Odd">
</form>
</center>
</body>
</html>



java file

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EOCheck")
public class EOCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public EOCheck() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			   throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=null;
		try {
			out=response.getWriter();
			int n=Integer.parseInt(request.getParameter("t1"));
			out.println("<center>");
			if(n%2==0)
				out.println(n+"is even number");
			else
				out.println(n+"is odd number");
		}
		catch(Exception e) {
			out.println("Error :"+ e.getMessage());
		}
	}

}

server:
http://localhost:8080/Project/EOCheck?t1=5
5is odd number 