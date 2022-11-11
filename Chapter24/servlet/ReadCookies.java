import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class ReadCookies extends HttpServlet 
{
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException 
{
  String cname[]=new String[20];
  String cvalue[]=new String[20];
 Cookie[] c = request.getCookies();
for(int i=0;i<c.length;i++)
{
cname[i]=c[i].getName();
cvalue[i]=c[i].getValue();
}

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    out.println("<html>");
    out.println("<head>");
    out.println("<title>Read Cookie</title>");
    out.println("</head>");
    out.println("<body>");
for(int i=0;i<c.length;i++)
{
out.println(cname[i]+" "+cvalue[i]);
}
   
  out.println("</body>");
    out.println("</html>");
 
  }
  
}
