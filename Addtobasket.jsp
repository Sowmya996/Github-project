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
button {
    background-color: darkkhaki;
    border: none;
    border-radius:12px;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
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
table{
border-collapse: collapse;
    width:100%;
    }
td {
    text-align: left;
    padding: 12px;
}
tr:nth-child(even) {background: gainsboro}
</style>
<script src="js/jquery-3.2.1.min.js"></script><script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script><script src="js/bootstrap.min.js"></script>
</head>
<body>
<h1>AddToBasket Page</h1>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Basket</a></li>
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
 <div class="container">        
  <table class="table table-hover">
    <tbody>
      <tr>
        <td>Product Type</td>
        <td>Game</td>
      </tr>
      <tr>
        <td>Name</td>
        <td>Dead Space 3 Limited Edition</td>
      </tr>
      <tr>
        <td>Description</td>
        <td>Dead Space 3</td>
      </tr>
      <tr>
        <td>Supplier</td>
        <td>We Are Games</td>
      </tr>
      <tr>
        <td>Price</td>
        <td>20.00</td>
      </tr>
    </tbody>
  </table>
  <div class="container">
  <button1 type="button" class="btn btn-info">Add To Basket</button1>
</div>
</div>
<br/>
<div class="panel panel-default">
  <div class="panel-body">&copy;NIIT E-Commerce Case Study Project 2017</div>
</div>
</body>
</html>