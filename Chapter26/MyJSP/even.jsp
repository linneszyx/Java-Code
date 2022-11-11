<%@ page language="java"%>
<html>
<head>
<title>Check No is Even or ODD in JSP</title>
</head>

<body>
<%
 int i=10;
  if((i%2)==0)
  {
   out.print("Given No is Even number  :"+i); 
   out.print("<br>");
  }
 else 
out.print("Given No is ODD number  :"+i); 
%>
</body>
</html>
