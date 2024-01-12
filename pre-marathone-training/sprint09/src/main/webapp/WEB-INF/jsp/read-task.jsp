<%@ page import="model.Task" %><%--
  Created by IntelliJ IDEA.
  User: Viacheslav
  Date: 12.01.2024
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Read task</title>
</head>
<body>
<%@include file="header.jsp" %>
<h2>Read existing Task</h2>
<%
    Task task = (Task) request.getAttribute("task");
%>
<table>
    <tr>
        <td>Id:</td>
        <th><%=task.getId()%>
        </th>
    </tr>
    <tr>
        <td>Name:</td>
        <th><%=task.getTitle()%>
        </th>
    </tr>
    <tr>
        <td>Priority:</td>
        <th><%=task.getPriority()%>
        </th>
    </tr>
</table>

</body>
</html>
