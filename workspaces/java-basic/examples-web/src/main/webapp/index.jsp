<%@ page language="java" 
		 contentType="text/html; charset=UTF-8"
    	 pageEncoding="UTF-8"%>
    	 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Web Examples Home</title>
</head>
<body>
	<h2>Hello, Java Web Prgramming</h2>
	<h2><%= new java.util.Date().toString() %></h2>
	<hr>
	<h3>GET REQUEST</h3>
	<form action="/examples-web/param-test.action" method="get">
		DATA 1 : <input type="text" name="data1">
		<br>
		DATA 2 : <input type="text" name="data2">
		<br>
		<input type="submit" value="서버로 전송">
	</form>
	<h3>POST REQUEST</h3>
	<form action="/examples-web/param-test.action" method="post">
		DATA 1 : <input type="text" name="data1">
		<br>
		DATA 2 : <input type="text" name="data2">
		<br>
		<input type="submit" value="서버로 전송">
	</form>
</body>
</html>