<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Game Page</title>
</head>
<body>
<h2>Game</h2>
<form action="game" method="post">
    <label for="dieNumber">Enter die number to roll (1-3):</label><br>
    <input type="number" id="dieNumber" name="dieNumber" min="1" max="3" required><br>
    <input type="submit" value="Roll the die">
</form>
<p>Last roll: ${sessionScope.rollResult}</p>
</body>
</html>
