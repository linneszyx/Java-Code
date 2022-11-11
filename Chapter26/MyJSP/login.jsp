<%@ page language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<body>


<table  align = center border=0 cellspacing=10 cellpadding=10 >
<caption align=center valign= mid ><font color=grey><b><marquee><b>Personal Information</b></marquee></b></font></caption>
<form method =post>
<tr ><td> Name:</td><td  ><input type=text name="t1" ></td></tr>
<tr><td> Password:</td><td  ><input type=password name="t2"></td></tr>
<tr><td> Re-Type:</td><td   ><input type=password name="t3"  ></td></tr>
<tr><td> Address:</td><td  ><Textarea name="t4"></textarea></td></tr>
<tr><td> Pincode:</td><td  > <input type=text name="t5" ></td></tr>
<tr><td> E-Mail:</td><td  ><input type=text name="t6" ></td></tr>
<tr><td></td><td  ><input type=submit value="LOG IN"></td</tr>
</form>
</table>
<hr>
<c:set var="x" value="${6}" />
<c:if test="${ param.t1 ne null}">
    <c:choose>
	<c:when test="${param.t1 eq null}">
	    please enter ur name
	</c:when> 
	<c:when test="${(param.t2 ne param.t3)or(param.t2 eq null)}">
		  please enter the password correctly		  
	</c:when> 
	<c:when test="${(param.t4 lt x)or(param.t4 gt x)}">
			  please enter the 6 digit pin code		  
	</c:when> 
	<c:otherwise>
		Name: <c:out value="${param.t1}"/><br><br>
		Password: <c:out value="${param.t2}"/><br><br>
		Address: <c:out value="${param.t4}"/><br><br>
		PinCode: <c:out value="${param.t5}"/><br><br>
	        E-mail: <c:out value="${param.t6}"/><br><br>
	</c:otherwise>
   </c:choose>	
  </c:if> 
</body>
</html>