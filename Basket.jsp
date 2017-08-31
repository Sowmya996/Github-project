<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
nav {
height: 50px;
width: 100%;
background-color: black;
}
li a {
    list-style: none;
    display:block;
    color: white;
    text-align:left;
}
button {
    background-color: blue;
    border: none;
    border-radius:12px;
    color: white;
    padding: 10px 5px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
p{
background-color: lightblue;
}
button1 {
    background-color: darkgrey;
    border: none;
    border-radius:10px;
    color: white;
    padding: 5px 12px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 2px 2px;
    cursor: pointer;
}
table {
    border-collapse: collapse;
    width:150%;
}

th, td {
    text-align: left;
    padding: 20px;
}
tr:nth-child(even) {background: azure}
th {
    background-color: lightgrey;
    color:black;
}
</style>
<script src="js/jquery-3.2.1.min.js"></script><script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script><script src="js/bootstrap.min.js"></script>
</head>
<body>
<h1>Basket Page</h1>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Basket</a></li>
       <li><a href="#">View Profile</a></li>
        <li><a href="#">Logout</a></li>
    </ul>
  </div>
</nav>
<div class="container">
  <div class="jumbotron">
    <h2>Basket</h2>         
<div class="container">
  <button type="button" class="btn btn-info">Continue Shopping</button>
  </div>
  </div>
  </div>
  <p>Currently your basket contains 1 truly awesome products</p>
  <div class="table-responsive">          
  <table class="table">
    <thead>
      <tr>
        <th>Name</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>Dead Space 3 Limited Edition</td>
        <td><div class="container">
  <button1 type="button" class="btn btn-info">Remove</button1></td>
        </tr>
        <tr>
        <td>A Long Walk To Freedom</td>
        <td><div class="container">
  <button1 type="button" class="btn btn-info">Remove</button1></td>
        </tr>
        </tbody>
        </table>
        </div>
        <br/>
        <br/>
        <div class="panel panel-default">
  <div class="panel-body">&copy;NIIT E-Commerce Case Study Project 2017</div>
</body>
</html>