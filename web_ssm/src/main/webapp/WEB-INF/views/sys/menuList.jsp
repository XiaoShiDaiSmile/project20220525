<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/5/25
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>MenuList</div>
<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>名称</th>
            <th>操作</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${list}" var="menu">
            <tr>
                <td>${menu.id}</td>
                <td>${menu.name}</td>
                <td>
                    <a href="/sys/delete?id=${menu.id}" onclick="return confirm('确定删除该数据?',this.href)">删除</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
