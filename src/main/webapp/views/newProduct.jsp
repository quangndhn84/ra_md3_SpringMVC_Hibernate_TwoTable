<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: This MC
  Date: 12/07/2024
  Time: 8:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new Product</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/productController/create" method="post">
    <label for="productId">Product Id</label>
    <input type="text" name="productId" id="productId"/><br>
    <label for="productName">Product Name</label>
    <input type="text" name="productName" id="productName"/><br>
    <label for="price">Price</label>
    <input type="text" name="price" id="price"/><br>
    <label for="catalogId">Chose Catalog</label>
    <select id="catalogId" name="catalog.catalogId">
        <c:forEach items="${listCategories}" var="catalog">
            <option value="${catalog.catalogId}">${catalog.catalogName}</option>
        </c:forEach>
    </select><br>
    <label for="active">Status</label>
    <input type="radio" name="status" id="active" value="true" checked/><label for="active">Active</label>
    <input type="radio" name="status" id="inActive" value="false"/><label for="inActive">Inactive</label><br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>
