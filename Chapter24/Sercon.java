import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class Sercon extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)
	{
		try{
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			out.write("<html><head><title>Servlet Example</title></head><body>");
			out.write("<h1>Servlet output</h1><hr>");
                ResultSet rs;
                
               	try
                {
		        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c=DriverManager.getConnection("jdbc:odbc:db");
			Statement st=c.createStatement();
			rs=st.executeQuery("select * from Stud");
			while(rs.next())
			{
				out.println(rs.getString("Name"));
			}

		}
		catch(Exception e)
		{
                out.println(e);
		}
		out.write("</body></html>");
		}catch(Exception e){}
	}
}