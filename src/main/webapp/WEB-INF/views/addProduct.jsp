<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>Add Product</title>
<!-- Latest compiled and minified CSS -->
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
				<a href="?locale=en">English</a> |
				<a href="?locale=vn">Vietnamese</a>
				<h1>Add Product</h1>
				<p>
					<a href="../products" class="btn btn-primary btn-lg" role="button">Product
						List</a>
				</p>
			</div>
		</div>
		<div class="row">
			<form:form modelAttribute="newProduct" method="post">
				<form:errors path="*" element="div" />
				<table class="table table-hover">
					<tr>
						<td><spring:message code="addProduct.form.productId.label"/></td>
						<td><form:input path="productId" /></td>
					</tr>
					<tr>
						<td><spring:message code="addProduct.form.name.label"/></td>
						<td><form:input path="name" /></td>
					</tr>
					<tr>
						<td><spring:message code="addProduct.form.description.label"/></td>
						<td><form:textarea path="description" /></td>
					</tr>
					<tr>
						<td><spring:message code="addProduct.form.unitPrice.label"/></td>
						<td><form:input path="unitPrice" /> USD</td>
					</tr>
					<tr>
						<td><spring:message code="addProduct.form.unitsInStock.label"/></td>
						<td><form:input path="unitsInStock" /> units</td>
					</tr>
					<tr>
						<td><spring:message code="addProduct.form.manufacturer.label"/></td>
						<td><form:input path="manufacturer" /></td>
					</tr>
					<tr>
						<td><spring:message code="addProduct.form.category.label"/></td>
						<td><form:input path="category" /></td>
					</tr>
					<tr>
						<td><spring:message code="addProduct.form.condition.label"/></td>
						<td>
							<form:radiobutton path="condition" value="New" /> <spring:message code="addProduct.form.condition.new.label"/>
							<form:radiobutton path="condition" value="Old" /> <spring:message code="addProduct.form.condition.old.label"/>
							<form:radiobutton path="condition" value="Refurbished" /> <spring:message code="addProduct.form.condition.refurbished.label"/>
						</td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Add" class="btn btn-primary"/></td>
					</tr>
				</table>
			</form:form>
			 
		</div>
	</div>

</body>
</html>
