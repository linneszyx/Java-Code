<%@ page language="java" import="java.sql.*" %>
<html><head></head><body>
<%
try
	{
		String database="c:\\student1.mdb";
                String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=" + database + ";DriverID=22;READONLY=true"; 
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection(url,"","");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select *from student");
		out.write("<table border=1 align=center><tr><th>Name</th><th>Address</th><th>MobileNo</th></tr>");
                        while(rs.next())
			{
				String s1=rs.getString(1);
				String s2=rs.getString(2);
				String s3=rs.getString(3);
				out.write("<tr>");
	out.write("<td>"+s1+"</td>");
	out.write("<td>"+s2+"</td>");
	out.write("<td>"+s3+"</td>");
	out.write("</tr>");
			}
							
		}
		catch(Exception e)
		{
				out.write(e.getMessage());
		}

		


%>
</table>
</body></html>