package myserv;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessForm
 */
@WebServlet("/ProcessForm")
public class ProcessForm extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



	
		java.io.PrintWriter out=response.getWriter();
		out.println("<html>");
		String name=request.getParameter("uname");
		String colors[]=request.getParameterValues("colors");
		
		for(int i=0;i<colors.length;i++)
			out.println("<font color='"+ colors[i]+"'>Hello"+name+"</font><br>");
		out.println("</body></html>");
		
	



		doGet(request, response);
	}

}
