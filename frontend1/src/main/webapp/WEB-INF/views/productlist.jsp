<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container text-center">
		<h2>Products</h2>
		<hr>
		<c:forEach var="product" items="${productList}">
			<div class="col-md-6">
				<div class="col-md-6">
					<img src="<c:url value="resources/images/${product.id}.jpeg" />"
						alt="${product.name}" width="200px" height="200px" /> <br /> <br />

				</div>
				<div class="col-md-6">
					<h3>${product.name}</h3>
					<p>${product.description}</p>
					<p>
						<i class="fa fa-inr" aria-hidden="true"></i>${product.price}</p>
					<p>
						<a href="mycart/add/${product.id}"><button type="button"
								class="btn btn-success">
								Add to Cart<span class="glyphicon glyphicon-shopping-cart"></span>
							</button></a>
					</p>
					<br /> <br /> <br />
				</div>
			</div>

		</c:forEach>
	</div>
</body>
</html>
