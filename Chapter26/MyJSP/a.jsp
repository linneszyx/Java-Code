<% String name=request.getParameter("name");%>
<% String icecream=request.getParameter("icecream");%>
<% String[] kind=request.getParameterValues("topping");%>
<% String place=request.getParameter("place");%>
<%int i;%>


<html>
<body>
Ms.<%=name%>
Welcome to our shop for purchasing <%=icecream%>
<% if(kind==null)%>
with no topping 
<% else {%>
with topping
<%for(i=0;i<kind.length;i++){%>
<%=kind[i]%>
<%}%>
<%}%>
<% if(place.equals("here")){%>
enjoy eating here
<%}else %>
enjoy eating out
</body>
</html>
