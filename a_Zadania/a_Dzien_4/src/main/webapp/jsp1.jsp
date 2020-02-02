<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 26.01.2020
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:out value="${user_role}" default="guest"/>
</body>
</html>
