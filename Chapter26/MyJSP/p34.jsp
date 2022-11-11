<%@ page language="java" import="java.sql.*,java.io.*,java.util.*" %>
<html><head></head><body>
<table border=1 align=center>
<tr><th>Name</th><th>Address</th><th>MobileNo</th></tr>
<%
ResultSet rs;
try
{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection c=DriverManager.getConnection("jdbc:odbc:stud");
	Statement st=c.createStatement();
	rs=st.executeQuery("select * from Student");
while(rs.next())
{
	out.write("<tr>");
	out.write("<td>"+rs.getString("Name")+"</td>");
	//out.write("<td>"+rs.getString("Address")+"</td>");
	//out.write("<td>"+rs.getString("MobileNo")+"</td>");
	out.write("</tr>");
}
}
catch(Exception e)
{}
%>
</table>
</body></html>