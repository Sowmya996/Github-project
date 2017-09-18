<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Food Items</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="Resources/js/bootstrap.min.js"></script>
<style>
#header
{
background-color:white;
color:Crimson;
text-align:centre;
padding:2px;
background-color:Azure;
}
#nav
{
line-height:20px;
background-color:#eeeeee;
height:443px;
width:14%;
float:left;
padding:5px;
text-align:left;
}
#section
{
height:443px;
width:80%;
float:left;
padding:10px;
background-color:ffffcc;
}
#footer
{
background-color:black;
color:white;
clear:both;
text-align:centre;
padding:5px;
}
</style>
</head>
<body>

<div id="header">
<h3>Welcome To FoodCourt</h3>
</div>
<div id="nav">
<nav class="navbar navbar-default">
  <div class="container-fluid">
  <ul class="nav navbar-nav">
  <li class="active">
  <li><a href="/">Home</a></li>
  <li><a href="Category.jsp?p=Category">Select Category</a></li>
  <li><a href="AllCategories.jsp?p=AllCategories">All Categories</a></li>
  <li><a href="Login.jsp?p=Login">Login</a></li>
  <li><a href="Signup.jsp?p=Signup">Signup</a></li>
  <li><a href="Aboutus.jsp?p=Aboutus">About Us</a></li>
  </ul>
</div>
</nav>
</div>
<div id="section">
<!-- Slider Code -->
<div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="2000">
<!-- wrapper for slides -->
<div class="carousel-inner" role="listbox">
<div class="item active">
<a href="Category.jsp?p=Burger"><img src="Resources/Images/burger.jsp" alt="Burger"/></a>
</div>
<div class="item">
<a href="Category.jsp?p=Cooldrink"><img src="Images/cooldrink.jsp" alt="Cool Drink"/></a>
</div>
<div>
<a href="Category.jsp?p=Icecream"><img src="Images/icecream.jsp" alt="Ice cream"/></a>
</div>
<div>
<a href="Category.jsp?p=Pizza"><img src="Images/pizza.jsp" alt="Pizza"/></a>
</div>
<div>
<a href="Category.jsp?p=Puffs"><img src="Images/puffs.jsp" alt="Puff"/></a>
</div>
</div>
</div>
</div>

<div id="footer">
&copy; FoodCourt.com
</body>
</html>