<%@page import="javax.servlet.http.Cookie"%>
<html>
    <head>
        <title>Removing existing cookie</title>
    </head>
    <body>
        <%
            Cookie[] list = request.getCookies();
            if (list != null) {
                for (int i = 0; i < list.length; i++) {
                    list[i].setMaxAge(0);
                    out.write(list[i].getName() + " cookie is removed <br>");
                }
            }
        %>
    </body>
</html>
