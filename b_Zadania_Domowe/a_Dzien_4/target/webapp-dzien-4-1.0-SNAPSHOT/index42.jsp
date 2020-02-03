<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 03.02.2020
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach begin="2" end="10" step="2" varStatus="loop">
    ${loop.index}<br>
</c:forEach>
</body>
</html>
