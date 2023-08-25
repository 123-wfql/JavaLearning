<%--
  Created by IntelliJ IDEA.
  User: wfql
  Date: 2023/8/25/025
  Time: 1:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
    <p>${tips}</p>
    <form action="uploading" method="post" enctype="multipart/form-data">
        <p>
            请选择图片：<input type="file" name="file">
        </p>

        <p>
            <input type="submit" name="上传">
        </p>
    </form>
</body>
</html>
