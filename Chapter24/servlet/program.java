import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class program extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException
{
res.setContentType("text/HTML");
PrintWriter out=res.getWriter();
out.println("<HTML><HEAD><TITLE>My First servlet</TITLE></HEAD><BODY>");
out.println("<b>servlet output</b></BODY></HTML>");
}
}
