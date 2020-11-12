<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html  >
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>Product</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <a class="navbar-brand" href="#">Mobile Shopping</a>

  <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li class="nav-item active">
        <a class="nav-link" href="welcomepage">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">product</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="addproduct">ADD PRODUCTS</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>

<div class="container text-center">
				<h3>ADD PRODUCTS</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="add-product">
					 <input type="hidden"  value="*{id}" />  
					<div class="form-group">
						<label class="control-label col-md-3">productId </label>
						<div class="col-md-3">
							<input type="text" class="form-control" name="productId"
								value="${PRODUCT.productId }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">categoryId </label>
						<div class="col-md-3">
							<input type="text" class="form-control" name="categoryId"
								value="${PRODUCT.categoryId }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">brand</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="brand"
								value="${PRODUCT.brand }" />
						</div>
					</div>		
<!-- 					<div class="form-group"> -->
<!-- 						<label class="control-label col-md-3">brandImage</label> -->
<!-- 						<div class="col-md-7"> -->
<!-- 							<input type="image" class="form-control" name="brandImage" -->
<%-- 								value="${prod.brandImage }" /> --%>
<!-- 						</div> -->
<!-- 					</div>				 -->
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Register" />
					</div>
				</form>
			</div>
 
     <!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
       
 
</body>
</html>