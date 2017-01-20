<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Product List</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<div class="container">
				<h1>Product List</h1>
				<a href="products/add" class="btn btn-primary btn-lg" role="button">Add Product</a>
			</div>
		</div>
		<div class="row">
			<c:forEach items="${products}" var="product">
				<div class="col-lg-4">
					<h3>
						<a href="product/${product.productId}">${product.productId} -
							${product.name}</a>
						<a href="products/update/${product.productId}"><span class="glyphicon glyphicon-wrench"></span></a>
						<a href="products/delete/${product.productId}"><span class="glyphicon glyphicon-remove"></span></a>
					</h3>
					<p>${product.description}</p>
					<p>${product.unitPrice}USD</p>
					<p>Availabe ${product.unitsInStock} units in stock</p>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>
