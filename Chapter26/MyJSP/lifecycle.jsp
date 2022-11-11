<html>
<head>
<title>The lifecycle of JSP page</title>
</head>

<body>
<h1>Showing the life cycle of JSP</h1>
<%!
String s;
public void jspInit()
{
s="init";
}
public void jspTransleted()
{
s=s+" "+"Translated";
}
public void _jspService()
{
s=s+" "+"Service";
}

public void jspDestroy()
{
s=s+" "+"Destroy";
}
%>

<%
out.println("You are in <B>"+s+"</B> JSP State "+"<br>");
%>
</body>
</html>
