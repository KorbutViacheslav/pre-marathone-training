<%@ page import="model.Task" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <% request.setAttribute("pageTitle", "Read existing Task"); %>
    <%@ include file="head.jsp" %>
</head>
<body>
<%@ include file="navigation.jsp" %>


<%
    Task task = (Task) request.getAttribute("task");
%>

<table>
    <tr>
        <td>Id:</td>
        <td><b><%=task.getId()%>
        </b></td>
    </tr>
    <tr>
        <td>Title:</td>
        <td><b><%=task.getTitle()%>
        </b></td>
    </tr>
    <tr>
        <td>Priority:</td>
        <td><b><%=task.getPriority()%>
        </b></td>
    </tr>
</table>

</body>
</html>


