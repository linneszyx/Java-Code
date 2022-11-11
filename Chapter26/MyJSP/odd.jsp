<%@ page language="java"%>
<html>
<head>
<title>Odd number program in JSP</title>
</head>
<body>
<%
 for(int i=0;i<=10;i++) 
 {
  if((i%2)!=0)
  {
   out.print("Odd number  :"+i); 
   out.print("<br>");
  }
 }
%>
</body>
</html>
