<%--
  Created by IntelliJ IDEA.
  User: ttn
  Date: 17/3/19
  Time: 1:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <div style="border-style: solid">
        <h1>For User Login</h1>
        <form action="login">
            UserName :<input type="text" name="username">
            Password :<input type="password" name="password">
            <input type="submit">
        </form>
    </div>
    <div style="border-style: solid">
        <h1>For Admin User</h1>
        <form action="admin">
            UserName :<input type="text" name="username">
            Password :<input type="password" name="password">
            <input type="submit">
        </form>
    </div>
</body>
</html>
