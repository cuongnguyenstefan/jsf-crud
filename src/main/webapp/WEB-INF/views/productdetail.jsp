<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Product: ${product.name}</title>
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
				<h1>Product: ${product.name}</h1>
			</div>
		</div>

		<table class="table table-hover">
			<tr>
				<td>ID</td>
				<td>${product.productId}</td>
			</tr>
			<tr>
				<td>Name</td>
				<td>${product.name}</td>
			</tr>
			<tr>
				<td>Description</td>
				<td>${product.description}</td>
			</tr>
			<tr>
				<td>Price</td>
				<td>${product.unitPrice}USD</td>
			</tr>
			<tr>
				<td>In Stock</td>
				<td>${product.unitsInStock}units</td>
			</tr>
			<tr>
				<td>Ordered</td>
				<td>${product.unitsInOrder}units</td>
				<td>
					<form action="../order/${product.productId}" method="get">
						<input type="text" name="quantity" placeholder="Make Order" /><input
							class="btn btn-success" type="submit" />
					</form>
				</td>
			</tr>
			<tr>
				<td>Manufacturer</td>
				<td>${product.manufacturer}</td>
			</tr>
			<tr>
				<td>Category</td>
				<td>${product.category}</td>
			</tr>
			<tr>
				<td>Discontinued</td>
				<td>${product.discontinued}</td>
			</tr>
			<tr>
				<td>Condition</td>
				<td>${product.condition}</td>
			</tr>
		</table>
	</div>
</body>
</html>
