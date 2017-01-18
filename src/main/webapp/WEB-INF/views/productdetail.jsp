<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Product: ${product.name}</title>
</head>
<body>
	<h1>Product: ${product.name}</h1>
	<table>
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
			<td>${product.unitPrice} USD</td>
		</tr>
		<tr>
			<td>In Stock</td>
			<td>${product.unitsInStock} units</td>
		</tr>
		<tr>
			<td>Ordered</td>
			<td>${product.unitsInOrder} units</td>
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

</body>
</html>
