<%@ page language="java" import="java.sql.*,java.io.*,java.util.*" %>
<html><head></head><body>
<table border=1 align=center>
<tr><th>Name</th><th>Address</th><th>MobileNo</th></tr>
<%
try
{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection con=DriverManager.getConnection("jdbc:odbc:stud");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("Select * from Student");
while(rs.next())
{
	out.write("<tr>");
	out.write("<td>"+rs.getString("Name")+"</td>");
	out.write("<td>"+rs.getString("Address")+"</td>");
	out.write("<td>"+rs.getString("MobileNo")+"</td>");
	out.write("</tr>");
}
}
catch(Exception e)
{}
%>
</table>
</body></html>