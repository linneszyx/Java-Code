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
	String s1=rs.getString("Name");
	String s2=rs.getString("Address");
	String s3=rs.getString("MobileNo");
	out.write("<tr>");
	out.write("<td>"+s1+"</td>");
	out.write("<td>"+s2+"</td>");
	out.write("<td>"+s3+"</td>");
	out.write("</tr>");
}}
catch(Exception e)
{}
%>
</table>
</body></html>