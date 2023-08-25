<%--
  Created by IntelliJ IDEA.
  User: wfql
  Date: 2023/8/17/017
  Time: 1:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<h1>请登录</h1>
<form action="/checkLogin" method="post">
    <p>用户名：<label>
        <input type="text" name="loginId">
    </label></p>
    <p>密码：<label>
        <input type="password" name="loginPwd">
    </label></p>
    <input type="submit" value="登录">
</form>
</body>
</html>
