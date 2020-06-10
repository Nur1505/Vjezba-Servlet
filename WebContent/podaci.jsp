<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Podaci</title>
</head>
<body>

<p>ime:   <%=request.getParameter("ime")%></p>
<p>prezime: <%=request.getParameter("prezime")%></p>
<p>datum rodjenja: <%=request.getParameter("datum")%> </p>
<p>email: <%=request.getParameter("email")%> </p>
<p>adresa: <%=request.getParameter("adresa")%> </p>
</body>
</html>