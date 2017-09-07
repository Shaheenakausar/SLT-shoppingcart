<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="/css/indexcss.css" rel="stylesheet" type="text/css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style>
.carousel-inner>.item>img {
	margin: 0 auto;
}
</style>
<title>WELCOME TO BOUQUET PAGE</title>
</head>
<%@include file="header.jsp"%>
<body background="resources//images/back.jpg">

	<nav id="navbar-red" class="navbar navbar-light navbar-fixed-top"
		style="background-color:#EE82EE" role="navigation">
	<div class="container">
		<ul class="nav navbar-nav">
			<button type="button" class="navbar navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</ul>
	</div>
	<div class="collaps navbar-collapse" id="bs-example-navbar-collapse-1">
		<ul class="nav navbar-nav">

			<li><a href="home">Home</a></li>
			<li><a href="contact">Contact Us</a></li>
			<li><a href="productlist">Product</a></li>
			<!-- <li><a href="Contact Us"><i class="fa fa-address-book"aria-hidden="true"></i></a></li> -->
		</ul>

		<ul class="nav navbar-nav navbar-right">

			<li><a href="login"><span class="glyphicon glyphicon-log-in"></span>
					login</a></li>
			<li><a href="signup"><span
					class="glyphicon glyphicon-log-in"></span> Signup</a></li>
			<!-- <li><a href="#"><span
					class="glyphicon glyphicon-shopping-cart"></span>Cart</a></li> -->
					<li><a href="Cart">Cart</a></li>
		</ul>
	</div>
	</nav>
	<br><br><br><br><br><br><br>

	<div class="container-fluid">
		<!-- Indicators -->
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">


				<div class="item active">
					<img src="resources//images//1.jpg" alt="first slide" />
					<div class="carousel-caption">
						<p>Flower bouquets</p>
					</div>
				</div>

				<div class="item">
					<img src="resources//images//2.jpg" alt="second slide" />
					<div class="carousel-caption">
						<p>Mothers day special flower bouquets</p>
					</div>
				</div>

				<div class="item">
					<img src="resources//images//3.jpg" alt="third slide" />
					<div class="carousel-caption">
						<p>Birthday day special flower bouquets</p>
					</div>
				</div>

				<div class="item">
					<img src="resources//images//4.jpg" alt="fourth slide" />
					<div class="carousel-caption">
						<p>Marriage flower bouquets</p>
					</div>
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right"></span> <span
				class="sr-only">Next</span>
			</a>
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
				<li data-target="#myCarousel" data-slide-to="3"></li>
			</ol>
		</div>
	</div>

</body>
</html>
<%@include file="footer.jsp"%>
