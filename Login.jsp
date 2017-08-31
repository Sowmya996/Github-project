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
    background-color: blue;
    border: none;
    border-radius:10px;
    color: white;
    padding: 10px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
button1 {
    background-color: grey;
    border: none;
    border-radius:10px;
    color: white;
    padding: 10px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
</style>

<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    
</head>
<body>
<h1>Login Page</h1>
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
    <h2>Login</h2>      
<div class="container">
  <button type="button" class="btn btn-info">Continue Shopping</button>
</div>
</div>
</div>
<div class="container">
    <div class="row">
        <div class="form_bg">
            <form>
                <div class="container">
  <div class="page-header">
    <h1>Please Login</h1>      
  </div> 
</div>
                <div class="form-group">
                <p>Username</p>
                    <input type="username" class="form-control" id="username" >
                </div>
                <div class="form-group">
                <p>Password</p>
                    <input type="password" class="form-control" id="pwd" >
                </div>
                <br/>
                <div class="align-center">
                    <button1 type="submit" class="btn btn-default" id="login">Login</button1>
                </div>
            </form>
        </div>
    </div>
</div>
<br/>
<div class="panel panel-default">
  <div class="panel-body">&copy;NIIT E-Commerce Case Study Project 2017</div>
</div>
</body>
</html>