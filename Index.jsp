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
p{
background-color: skyblue;
}
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 12px;
}
tr:nth-child(even) {background: azure}
th {
    background-color: #4CAF50;
    color:white;
}
</style>
<script src="js/jquery-3.2.1.min.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script><script src="js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Basket</a></li>
           </ul>
           <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span>Login</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span>Register</a></li>
    </ul>
  </div>
</nav>

<div class="container">
  <div class="jumbotron">
    <h2>NIIT E-Commerce Project</h2>  
    <p1>Welcome to the home of all things NIIT.</p1>    
  </div>         
</div>
<p>Currently your basket contains 1 truly awesome products</p>                                                            
  <div class="table-responsive">          
  <table class="table">
    <thead>
      <tr>
        <th>Name</th>
        <th>Price</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>Dead Space 3 Limited Edition</td>
        <td>20.00</td>
        </tr>
        <tr>
        <td>Hitman Absolution Profession Edition</td>
        <td>10.00</td>
      </tr>
      <tr>
        <td>Operation Flashpoint Red River</td>
        <td>11.12</td>
      </tr>
      <tr>
        <td>A Long Walk to Freedom</td>
        <td>23.00</td>
      </tr>
      <tr>
        <td>Politically Incorrect</td>
        <td>22.00</td>
      </tr>
      <tr>
        <td>The Bone Bed</td>
        <td>19.99</td>
      </tr>
    </tbody>
  </table>
  </div>
</div>
<br/>
<div class="panel panel-default">
  <div class="panel-body">&copy;NIIT E-Commerce Case Study Project 2017</div>
</div>
</body>
</html>