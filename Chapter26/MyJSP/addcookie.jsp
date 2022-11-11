<%@page import="javax.servlet.http.Cookie"%>
<html>
    <head>
        <title>Add Cookie</title>
    </head>
    <body>
        <%
            Cookie c = new Cookie("userId","Tanweer");
            c.setMaxAge(2100);
            response.addCookie(c);
        %>
A Cookie is Added, Thanks.
    </body>
</html>
