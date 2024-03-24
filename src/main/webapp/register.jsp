<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Page</title>
</head>
<body>
<h2>Registration Form</h2>
<form action="register" method="post">
    <label for="name">Name:</label><br>
    <input type="text" id="name" name="name" required><br>
    <label for="login">Login:</label><br>
    <input type="text" id="login" name="login" required><br>
    <label for="password">Password:</label><br>
    <input type="password" id="password" name="password" required><br>
    <input type="submit" value="Register">
    <p>Already have an account? <a href="login.jsp">Login here</a>.</p>
</form>
</body>
</html>
