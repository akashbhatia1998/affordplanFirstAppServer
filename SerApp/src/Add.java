
import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet{
	private static final long serialVersionUID = 1L;
   
    public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
    	process(req , res);
    }
    
    public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
    	process(req , res);
    }
    private void process(HttpServletRequest req , HttpServletResponse res)throws IOException {
    	String u = req.getParameter("u1");
    	String p = req.getParameter("p1");
    	HttpSession session = req.getSession();
    	String a = "";
    	session.setAttribute("a" , p);
    	
    	if(a.equals("abcd")){
    	  res.sendRedirect("welcomehtml.html");
    	}
    	else if(a.equals("")) res.sendRedirect("index.html");
    	else{
    		PrintWriter out = res.getWriter();  
    		res.setContentType("text/html");  
    		out.println("<script type=\"text/javascript\">");  
    		out.println("alert('wrong pass');");  
    		out.println("</script>");
    	    res.sendRedirect("index.html");
    	}
    }
}


	
