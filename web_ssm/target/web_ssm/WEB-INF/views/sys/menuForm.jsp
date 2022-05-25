<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/5/25
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>MenuForm</div>
<form:form id="menuForm" modelAttribute="menu" action="/sys/save" method="post">
    <form:input path="id" placeholder="编号"/>
    <form:input path="parentId" placeholder="父级编号"/>
    <form:input path="parentIds" placeholder="全部父级编号"/>
    <form:input path="name" placeholder="名称"/>
    <button type="submit">提交</button>
</form:form>
</body>
</html>
