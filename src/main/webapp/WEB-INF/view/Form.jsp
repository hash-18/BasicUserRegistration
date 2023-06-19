<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<style>
  form {
    width: 500px;
    margin: 0 auto;
    text-align: left;
  }
  label {
    font-weight: bold;
    font-size: 20px;
    margin-top: 20px;
    display: block;
  }
  input[type="text"], input[type="email"], input[type="password"] {
    width: 100%;
    padding: 10px;
    margin-top: 10px;
    font-size: 18px;
  }
  input[type="submit"] {
    margin-top: 20px;
    padding: 10px 20px;
    background-color: blue;
    color: white;
    font-size: 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
  }
</style>

<form action="processForm3" method="post">
  <label for="username">Username:</label>
  <input type="text" id="username" name="username"><br><br>

  <label for="email">Email:</label>
  <input type="email" id="email" name="email"><br><br>

  <label for="password">Password:</label>
  <input type="password" id="password" name="password"><br><br>

  <input type="submit" value="Submit">
</form> 


</body>
</html>