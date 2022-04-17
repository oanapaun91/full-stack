<%--
  Created by IntelliJ IDEA.
  User: oanapaun
  Date: 23.03.2022
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Bine ai venit in lumea Spring MVC!</h1>

<P>Timpul pe server este: ${serverTime}.</p>

<form action="user" method="post">
    <%--    <form action="user" method="post">--%>
    <input type="text" name="userName"><br>
    <input type="text" name="email"><br>
    <input type="text" name="telefon"><br>
    <input type="date" name="dataNasterii"><br>
    <input type="submit" value="Login">
</form>
</body>
</html>
