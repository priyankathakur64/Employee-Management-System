<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page
	import="com.EmployeeManagementSystemAPI.EmployeeManagementSystem.Employee"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="java.util.List"%>
<%@page import="org.springframework.web.bind.annotation.GetMapping"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.springframework.beans.factory.annotation.Autowired"%>
<%@page import="org.springframework.stereotype.Controller"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body bgcolor="skyblue">
	<font color="red"> <b><u><h1>EMPLOYEE MANAGEMENT SYSTEM</h1></u></b></font>
	<form action="save" method="post" style="font-size: 20px;">
		<pre>
			<b>
ID         <input type="number" name="eid" style="border-color: red;"
				size="20px"><br>
FirstName  <input type="text" name="fname" style="border-color: red;"
				size="20px"><br>
LastName   <input type="text" name="lname" style="border-color: red;"
				size="20px"><br>
DOB        <input type="date" name="DOB" style="border-color: red;"
				size="20px"><br>
Department <input type="text" name="Dept" style="border-color: red;"
				size="20px"><br>
Position   <input type="text" name="position" style="border-color: red;"
				size="20px"><br>
Salary     <input type="number" name="salary" style="border-color: red;"
				size="20px">				
			</b>
		</pre>

		<input type="submit" value="Save"
			style="background-color: orange; font-size: 25px;">

		<button type="submit" formaction="update"
			style="background-color: yellow; font-size: 25px;">Update</button>

		<button type="submit" formaction="delete"
			style="background-color: red; font-size: 25px;">Delete</button>

		<input type="reset" value="Clear"
			style="background-color: green; font-size: 25px;"><br>
	</form>
	<br>
	<table border="5" width="1000" height="100" cellspacing="8"
		cellpadding="12" bgcolor="#FFE5AD">
		<thead>
			<tr>
				<th>ID</th>
				<th>FIRSTNAME</th>
				<th>LASTNAME</th>
				<th>DOB</th>
				<th>Department</th>
				<th>Position</th>
				<th>Salary</th>
			</tr>
		</thead>
		<tbody>
			<%
			List<Employee> list1 = (List<Employee>) request.getAttribute("list");
			for (Employee emp : list1) {
			%>
			<tr>
				<td><%=emp.getEid()%></td>
				<td><%=emp.getFname()%></td>
				<td><%=emp.getLname()%></td>
				<td><%=emp.getDOB()%></td>
				<td><%=emp.getDept()%></td>
				<td><%=emp.getPosition()%></td>
				<td><%=emp.getSalary()%></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
	<style>
table, th, td {
	border: 1px solid;
	align: center;
}

body {
	padding-top: 10px;
	border: 4px solid black;
	padding: 20px;
}
</style>
</body>
</body>
</html>