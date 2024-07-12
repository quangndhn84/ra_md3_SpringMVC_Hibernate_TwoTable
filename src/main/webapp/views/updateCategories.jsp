<%--
  Created by IntelliJ IDEA.
  User: This MC
  Date: 12/07/2024
  Time: 8:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Categories</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/categoriesController/update" method="post">
    <label for="catalogId">Catalog ID</label>
    <input type="text" name="catalogId" id="catalogId" value="${catalog.catalogId}" readonly/><br>
    <label for="catalogName">Catalog Name</label>
    <input type="text" name="catalogName" id="catalogName" value="${catalog.catalogName}"/><br>
    <label for="description">Description</label>
    <input type="text" name="description" id="description" value="${catalog.description}"/><br>
    <label for="active">Status</label>
    <input type="radio" name="status" id="active" value="true" ${catalog.status?'checked':''}/><label for="active">Active</label>
    <input type="radio" name="status" id="inActive" value="false" ${catalog.status?'':'checked'}/><label
        for="inActive">Inactive</label><br>
    <input type="submit" value="Update"/>
</form>
</body>
</html>
