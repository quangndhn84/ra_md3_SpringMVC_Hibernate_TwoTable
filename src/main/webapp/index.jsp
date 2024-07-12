<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Admin Management</title>
</head>
<body>
<ul>
    <li>
        <a href="<%=request.getContextPath()%>/categoriesController/findAll">Quản lý danh mục</a>
    </li>
    <li>
        <a href="<%=request.getContextPath()%>/productController/findAll">Quuản lý sản phẩm</a>
    </li>
</ul>
</body>
</html>