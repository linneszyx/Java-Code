<%@ page language="java" %>
<html><body>
<%
	String s1=request.getParameter("name");
	String s2=request.getParameter("course");
	String s3=request.getParameter("age");
	out.write("Name is ::"+s1+"<BR>");
        out.write("Course is ::"+s2+"<BR>");
        out.write("Age is ::"+s3+"<BR>");
%>
</body></html>