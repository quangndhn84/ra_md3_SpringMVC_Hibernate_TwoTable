<%--
  Created by IntelliJ IDEA.
  User: This MC
  Date: 12/07/2024
  Time: 7:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create New Categories</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/categoriesController/create" method="post">
    <label for="catalogName">Catalog Name</label>
    <input type="text" name="catalogName" id="catalogName"/><br>
    <label for="description">Description</label>
    <input type="text" name="description" id="description"/><br>
    <label for="active">Status</label>
    <input type="radio" name="status" id="active" value="true" checked/><label for="active">Active</label>
    <input type="radio" name="status" id="inActive" value="false"/><label for="inActive">Inactive</label><br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>
