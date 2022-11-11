import javax.servlet.*;
import java.io.*;
import java.util.*;
public class SerLogin extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)
	{
		try{
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			out.write("<html><head><title>Servlet Example</title></head><body>");
			out.write("<h1>Servlet output</h1><hr>");
			String s1=req.getParameter("t1");
			String s2=req.getParameter("t2");
			if(s1.equals("ADMIN") && s2.equals("admin"))
			{
				out.write("Welcome Administrator!");
			}
			else if(s1.equals("tanweer03") && s2.equals("tanweer"))
			{
				out.write("Welcome Tanweer!");
			}
			out.write("</body></html>");
		}catch(Exception e){}
	}
}