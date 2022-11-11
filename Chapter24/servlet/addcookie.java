import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class addcookie extends HttpServlet 
{ 
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException 
{
    PrintWriter out;

         response.setContentType("text/html");
        out = response.getWriter();
  Cookie c1 = new Cookie("Tanweer","30");
  Cookie c2 = new Cookie("AAtif","02");
  response.addCookie(c1);
  response.addCookie(c2);
        out.println("<HTML><HEAD><TITLE>");
  out.println(" This output is generated from a Servlet");
  out.println("</TITLE></HEAD><BODY>");
  out.println("<h2> This Program add two Cookies<h2>");
  out.println("</BODY></HTML>");
  out.close();
    }
}
