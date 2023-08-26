<%--
  Created by IntelliJ IDEA.
  User: wfql
  Date: 2023/8/18/018
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>展示个人账号信息</title>
</head>
<body>
<%--    ${logins}--%>
    <table border="1">
        <caption>您的账号信息</caption>
        <tr> <th>账号</th> <th>密码</th> </tr>
        <c:if test="${users eq null}">
            <tr>
                <td colspan="2">您没有账号信息</td>
            </tr>
        </c:if>
        <c:if test="${users ne null}">
            <c:forEach var="user" items="${users}">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                </tr>
            </c:forEach>
        </c:if>
    </table>
</body>
</html>
