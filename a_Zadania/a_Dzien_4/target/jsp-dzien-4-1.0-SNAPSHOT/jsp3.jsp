<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 26.01.2020
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="mvc13" method="POST">
    <label>
        Title:
        <input type="text" name="title">
    </label>
    <label>
        Author:
        <input type="text" name="author">
    </label>
    <label>
        ISBN:
        <input type="number" name="isbn">
    </label>
    <input type="submit">
</form>
<c:out value="Tytul=${atrBook.title}"/><br>
<c:out value="Autor=${atrBook.author}"/><br>
<c:out value="ISBN=${atrBook.isbn}"/>
</body>
</html>
