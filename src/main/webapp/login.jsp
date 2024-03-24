<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>
<h2>Login Form</h2>
<form action="login" method="post">
    <label for="login">Login:</label><br>
    <input type="text" id="login" name="login" required><br>
    <label for="password">Password:</label><br>
    <input type="password" id="password" name="password" required><br>
    <input type="submit" value="Login">
    <p>you don't have an account? <a href="register.jsp">register here</a>.</p>
</form>
</body>
</html>
