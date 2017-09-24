<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title></title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  body {
      position: relative;

  }
  ul.nav-pills {
      top: 100px;
      position: fixed;

  }
  #section1 {color: #000; background-color: #fff;}
  #section2 {color: #000; background-color: #fff;}
  #section3 {color: #000; background-color: #fff;}
  #section4 {color: #000; background-color: #fff;}
  #section51 {color: #000; background-color: #fff;}
  #section52 {color: #000; background-color: #fff;}
  @media screen and (max-width: 810px) {
    #section1, #section2, #section3, #section4, #section51, #section52  {
        margin-left: 150px;
    }
  }
  </style>
</head>
<body data-spy="scroll" data-target="#myScrollspy" data-offset="20">
<jsp:include page="Header.jsp"></jsp:include>
<div class="container">
  <div class="row">
    <nav class="col-sm-3" id="myScrollspy">
      <ul class="nav nav-pills nav-stacked">
        <li class="active"><a href="#section1">View Products</a></li>
        <li><a href="#section2">Add Product</a></li>
        <li><a href="#section3">Add Category</a></li>      
         </ul>
        </li>
      </ul>
    </nav>
    <div class="col-sm-9">
      <div id="section1">
      	<div class="parallax"></div>
        <h1>Products</h1>
        <div class="table-responsive"> 
      	<table class="table table-hover" style="color: black">
      	<thead> 
      	<tr class="active"> 
      		<th>Product Name</th> <th>Selling Price</th> <th>Available</th> <th>Category</th> <th>Remove</th> 
      	</tr> 
      	</thead> 
      	<tbody> 
      	<c:forEach var="p" items="${products}">
      	<tr class="info">
      		<th scope="row"><a href="edit/${p.productId}">${p.name}</a></th>
      		<th scope="row">${p.price}</th>
  			<td>${p.available}</td>
  			<td>${p.categoryId.name}</td>
  			<td><a href="delete/${p.productId}"><img src="/ecomerce/resources/images/delete.png" width="20" height="20"></a></td>
		</tr>
	  </c:forEach>
	  </tbody>	
	  </table>
	  </div>
      </div>
      <div id="section2">
      	<div class="parallax"><hr style="width:100%;color: #ccc"/></div>
        <h1>Add Product</h1>
        <iframe src="Product" frameborder='0' style="width:100%;height: 600px;"></iframe>
      </div>
      <div id="section3">
        <div class="parallax"><hr style="width:100%;color: #ccc"/></div>
        <h1>Add Category</h1>
        <iframe src="Category" frameborder='0' style="width:100%;height: 600px;"></iframe>
      </div>
      <div id="section4">
      	<div class="parallax"><hr style="width:100%;color: #ccc"/></div>
        <h1>Approve Seller</h1>
        <iframe src="approveSeller" frameborder='0' style="width:100%;height: 600px;"></iframe>
      </div>
    </div>
  </div>
</div>
<br></br><br></br><br></br><br></br><br></br><br></br><br></br>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>