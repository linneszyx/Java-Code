<%@ page language="java" import="java.sql.*" %>
<%
                String database="c:\\BookDetails.mdb";
                String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=" + database + ";DriverID=22;READONLY=true"; 
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection con=null;
	        ResultSet rs=null;
	        Statement stmt=null;
     try{
		
		con=DriverManager.getConnection(url);
		stmt=con.createStatement();
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
if(request.getParameter("action") != null){ 
		String bookname=request.getParameter("Title");
		String author=request.getParameter("AuthorName");
		stmt.executeUpdate("insert into bookinfo values('"+bookname+"','"+author+"')");
		rs=stmt.executeQuery("select * from bookinfo");
		%>
<html>
		<body>
		<center>
			<h2>Books List</h2>
			<table border="1" cellspacing="0" cellpadding
="0">
			<tr>
				<td><b>S.No</b></td>
				<td><b>Book Name</b></td>
				<td><b>Author</.b></td>
			</tr>
			 	<%
				int no=1;
				while(rs.next()){
				%>
				<tr>
				  <td><%=no%></td>
				  <td><%=rs.getString("Title")%></td>
				  <td> <%=rs.getString("AuthorName")
%> </td>
				</tr>
				<%
				no++;
	}
	rs.close();
	stmt.close();
	con.close();
%>
			</table>
			</center>
		</body>
	</html>
<%}else{%>
	<html>
	<head>
		<title>Book Entry Form</title>
		<script language="javascript">
		    function validate(objForm){
			if(objForm.bookname.value.length==0){
			alert("Please enter Book Name!");
			objForm.bookname.focus();
			return false;
			}
			if(objForm.author.value.length==0){
			alert("Please enter Author name!");
			objForm.author.focus();
			return false;
			}
			return true;
				}
			</script>
		</head>
		
		<body>
			<center>
<form action="BookEntryForm.jsp" method="post" name="entry" onSubmit="return
 validate(this)">
	<input type="hidden" value="list" name="action">
	<table border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td>
			<table>
				<tr>
				<td colspan="2" align="center">
<h2>Book Entry Form</h2></td>
				</tr>
				<tr>
				<td colspan="2">&nbsp;</td>
				</tr>
				<tr>
				<td>Book Name:</td>
				<td><input name="Title" type=
"text" size="50"></td>
				</tr>
				<tr>
				<td>Author:</td><td><input name=
"AuthorName" type="text" size="50"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
<input type="submit" value="Insert"></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</form>
			</center>
		</body>
	</html>
<%}%>








