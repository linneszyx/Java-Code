import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class threadSafeServlet extends HttpServlet implements SingleThreadModel 
{
  
  private ServletConfig config;

  public void init (ServletConfig config) throws ServletException 
{
        this.config = config;
      }

  public void doGet (HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
   {
  
    res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println( "<html>" );
        out.println( "<head>" );
        out.println( "<title>This is A Thread safe Servlet</title>" );
        out.println( "</head>" );
        out.println( "<body>" );
        out.println( "<h1>A Thread Safe Servlet</h1>" );
        out.println( "</body>" );
        out.println( "</html>" );
        out.close();
    }
}
