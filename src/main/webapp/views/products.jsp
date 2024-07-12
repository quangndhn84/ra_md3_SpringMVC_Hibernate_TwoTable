<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: This MC
  Date: 12/07/2024
  Time: 8:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Product</title>
    <link href="/resources/css/style.css" rel="stylesheet"/>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>No</th>
        <th>Product ID</th>
        <th>Product Name</th>
        <th>Price</th>
        <th>Catalog Name</th>
        <th>Status</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listProducts}" var="product" varStatus="loop">
        <tr>
            <td>${loop.index+1}</td>
            <td>${product.productId}</td>
            <td>${product.productName}</td>
            <td>${product.price}</td>
            <td>${product.catalog.catalogName}</td>
            <td>${product.status?"Active":"Inactive"}</td>
            <td>
                <a href="">Update</a>
                <a href="">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="<%=request.getContextPath()%>/productController/initCreate">Create new product</a>
</body>
</html>
