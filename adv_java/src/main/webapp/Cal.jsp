<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background: #e5e5e5;">
<h1>HELLO WORLD</h1>

<%!
int a = 10;
int b = 20;
String name = "OM NAMAK SHIVAY";

public int dosum(){
	return a+b;
	}



public String reverse(){
	StringBuffer br = new StringBuffer(name);
	return br.reverse().toString();
}
%>

<%
out.println("a => " +a);
out.println("<br>");
out.println("b => " +b);

out.println("<br>");
out.println("sum of two no " +dosum());

out.println("<br>");
out.println("String name=> " +name);
out.println("<br>");
out.println("reverse String " +reverse());
%>

<h1 style="color:red;">sum of two no is : <%= dosum()%></h1>
<h2>ulata naam:<%=reverse() %></h2>
<h1 style="color:orange;">saral nav:<%=name %></h1>
</body>
</html>