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
    <% request.setAttribute("pageTitle", "Error Page"); %>
    <%@ include file="head.jsp" %>
</head>
<body>
<%@ include file="navigation.jsp" %>

<h2><%= request.getAttribute("message")%>
</h2>
<h3>url: <%= request.getAttribute("url")%>
</h3>
</body>
</html>
