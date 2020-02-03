<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 03.02.2020
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${greeting}
<form action="servlet312" method="POST">
    <select name="langs" multiple>
        <c:forEach items="${langs}" var="lang">
            <option value="${lang.value}">${lang.key}</option>
        </c:forEach>
    </select>
    <input type="submit">
</form>
</body>
</html>
