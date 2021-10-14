import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Register() {
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(jakarta.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   String uname=request.getParameter("uname");
	   String password=request.getParameter("password");
	   String email=request.getParameter("email");
	   String phone=request.getParameter("phone");
	   Member member = new Member(uname, password, email, phone);
	   RegisterDao rDao=new RegisterDao();
	   String result=rDao.insert(member);
	   response.getWriter().print(result);
	     
	}
}