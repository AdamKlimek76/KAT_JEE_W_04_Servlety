<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 04.02.2020
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:choose>
    <c:when test="${cookie.form.value=='1'}">
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. <br>
            Duis pulvinar varius arcu, eu vehicula eros lacinia in. <br>
            Ut sodales pharetra mauris, quis lobortis turpis placerat vehicula. <br>
            Maecenas a tortor augue. In mauris ex, facilisis id pharetra nec, laoreet id enim. <br>
            Phasellus sed tortor quam. Curabitur sit amet semper eros. Pellentesque sed risus vel sem tristique varius.
            <br>
            Nulla facilisi. Praesent id condimentum risus. Praesent congue mattis blandit. <br>
            Aenean ut nibh ac magna semper posuere in quis nibh.</p>
    </c:when>
    <c:otherwise>
        <form action="newsletter" method="POST">
            <label>
                E-mail:
                <input type="text" name="email">
            </label>
            <label>
                Name:
                <input type="text" name="name">
            </label>
            <input type="submit">
        </form>
        <c:forEach items="${userList}" var="list">
            ${list}<br>
        </c:forEach>
    </c:otherwise>
</c:choose>
</body>
</html>
