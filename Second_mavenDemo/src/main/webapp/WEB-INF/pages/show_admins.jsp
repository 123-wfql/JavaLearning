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
        <tr> <th>账号</th> <th>姓名</th> <th>密码</th> <th>类型</th></tr>
        <c:if test="${admins eq null}">
            <tr>
                <td colspan="4">您没有账号信息</td>
            </tr>
        </c:if>
        <c:if test="${admins ne null}">
            <c:forEach var="admin" items="${admins}">
                <tr>
                    <td>${admin.id}</td>
                    <td>${admin.username}</td>
                    <td>${admin.password}</td>
                    <td>${admin.adminType}</td>
                </tr>
            </c:forEach>
        </c:if>
    </table>
</body>
</html>
