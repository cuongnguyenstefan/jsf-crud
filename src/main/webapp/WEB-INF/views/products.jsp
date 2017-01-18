<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Product List</title>
</head>
<body>
	<h1>Product List!</h1>
	<c:forEach items="${products}" var="product">
		<div class="boxed">
			<h3><a href="product/${product.productId}">${product.productId} - ${product.name}</a></h3>
			<p>${product.description}</p>
			<p>${product.unitPrice}USD</p>
			<p>Availabe ${product.unitsInStock} units in stock</p>
		</div>
	</c:forEach>

</body>
</html>
