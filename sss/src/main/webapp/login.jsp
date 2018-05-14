<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>世纪网</title>
<!-- Bootstrap -->
<!-- <script type="text/javascript" src="../js/jquery-1.12.4.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/bootstrap.css" type="text/css"></link>
<link rel="stylesheet" href="css/bootstrap-theme.css" type="text/css"></link>
<link rel="stylesheet" href="css/login.css" type="text/css"></link> -->
<!-- 以下两个插件用于在IE8以及以下版本浏览器支持HTML5元素和媒体查询，如果不需要用可以移除 -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

<!-- 包括所有bootstrap的js插件或者可以根据需要使用的js插件调用　-->
<link rel="stylesheet" href="css/bootstrap.css" type="text/css"></link>
<link rel="stylesheet" href="css/bootstrap-theme.css" type="text/css"></link>
<link rel="stylesheet" href="css/login.css" type="text/css"></link>
<!-- 以下两个插件用于在IE8以及以下版本浏览器支持HTML5元素和媒体查询，如果不需要用可以移除 -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif] -->
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<!-- 包括所有bootstrap的js插件或者可以根据需要使用的js插件调用　-->
<script src="js/bootstrap.min.js"></script></head>
<body class="login">
	<a class="hiddenanchor" id="signup"></a>
	<a class="hiddenanchor" id="signin"></a>
	<div id="login_content">
	<h1>世纪人力交易平台</h1>
	<form action="" method="post">
	<div>
		<input name="shezhizhidingshuxing" type="text" class="form-control" placeholder="用户名"
			required="required" />
	</div><br>
	<div>
		<input name="shezhizhidingshuxing" type="password" class="form-control" placeholder="密码"
			required="required" />
	</div><br>
	<div>
		<input class="btn btn-default submit" type="submit" value="Log in">
		 <a class="reset_pass" href="#">Lost your password?</a>
	</div>
	</form>
	<div class="clearfix"></div>
	<div class="separator">
		<p class="change_link">
			New to site? <a href="#signup" class="to_register"> Create
				Account </a>
		</p>
	</div>
	</div>
	<hr>
</body>
</html>