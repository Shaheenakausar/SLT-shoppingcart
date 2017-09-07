<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="/css/logincss.css" rel="stylesheet" type="text/css">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<title>Login Page</title>

</head>
<%@ include file="header.jsp"%>

<body background="resources//images/login.jpg">
<body>
	<nav id="navbar-red" class="navbar navbar-light navbar-fixed-top" style="background-color:#8B0000" role="navigation">
	<div  class="container">
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
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="signup"> Signup</a></li>
		</ul>
	</div>
	</nav>
	<div id="fullscreen_bg" class="fullscreen_bg" />
	<div id="regContainer" class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">

								<a href="#" class="active" id="login-form-link">Login</a>
							</div>

						</div>
						<hr>
					</div>
					<div class="panel-body">




						<div class="row">
							<div class="col-lg-12">
								<form id="login-form" action="#" method="post" role="form"
									style="display: block;">
									<div class="form-group">
										<label for="username">Username</label> <input type="text"
											name="username" id="username" tabindex="1"
											class="form-control" placeholder="Username" value="">
									</div>
									<div class="form-group">
										<label for="password">Password</label> <input type="password"
											name="password" id="password" tabindex="2"
											class="form-control" placeholder="Password">
									</div>
									<div class="form-group text-center">
										<input type="checkbox" tabindex="3" class="" name="remember"
											id="remember"> <label for="remember">
											Remember Me</label>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="login-submit" id="login-submit"
													tabindex="4" class="form-control btn btn-login"
													value="Log In">
													<a href="productlist" class="btn btn-primary">login</a>	
											</div>
											
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

</html>