<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="Resources/js/bootstrap.min.js"></script>
  <style>
  #header
  {
  color:Grey;
  text-align:centre;
  padding:2px;
  }
  #b1
  {
  background-color:Azure;
  }
  </style>
</head>
<body id="b1">
<%
String name=request.getParameter("p");
%>
<centre><h1>Welcome to <%=name %> Page.</h1></centre>

</body>
</html>