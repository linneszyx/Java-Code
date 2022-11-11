
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
public class SingleThreadConnection extends HttpServlet implements SingleThreadModel 
{
 
   Connection con = null;  
   public void init(ServletConfig config) throws ServletException 
   {
    super.init(config);
    con = establishConnection();
   }
 
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException, SQLException
  {
    res.setContentType("text/plain");
    PrintWriter out = res.getWriter();
    Statement stmt = con.createStatement();
   }
 
  public void destroy() 
  {
    if (con != null) 
    con.close();
  }
 
  private Connection establishConnection() 
  {
   
  }
} 
