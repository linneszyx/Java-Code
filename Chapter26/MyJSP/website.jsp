<html>
<body>
<%
String s="http://www."+request.getParameter("web");
out.println("<H4>Click Here to open our website</H4><BR>");
out.println("<a href="+s+">Click here</a>");
//out.println(s);
%>
</body>
</html>
