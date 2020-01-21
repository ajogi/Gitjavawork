import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/StudentSel")
public class StudentSel extends HttpServlet {
    private static final long serialVersionUID = 1L;
	
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String s1=request.getParameter("userName");
        int studId=Integer.parseInt(s1);
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection cname=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
            PreparedStatement ps=cname.prepareStatement("select * from information where id=?");
            
            ps.setInt(1, userName);
            ResultSet re=ps.executeQuery();
            if(re.next())
            {
                cname.commit();
                PrintWriter out=response.getWriter();
                out.println(re.getString(2)+" "+re.getInt(3)+" "+re.getString(4)+" "+re.getLong(5));
                
            }
            else
            {
                response.sendRedirect("StudentSelect.html");
            }
        } 
        catch (ClassNotFoundException e) 
        {
            System.out.println(e);
        }
        
        catch(SQLException s)
        {
            System.out.println(s);
        }
    }
 
    
    
}
