<%--
  Created by IntelliJ IDEA.
  User: Viacheslav
  Date: 12.01.2024
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error page</title>
</head>
<body>
    <%@include file="header.jsp" %>
    <h2>
        Task with ID '<%=request.getParameter("id")%>' not found in To-Do List!
    </h2>
    <h3>
        url: <%=request.getAttribute("url")%>
    </h3>
</body>
</html>
