<%@page import="javax.servlet.http.Cookie"%>
<html>
    <head>
        <title>Read Cookie</title>
    </head>
    <body>
        <%
            Cookie[] list = request.getCookies();
            if(list != null){
                for(int i = 0; i < list.length;i++){
                    out.println(list[i].getName() + ":" + list[i].getValue()+"<br>");
                }
            }
        %>
    </body>
</html>
