<%--
  Created by IntelliJ IDEA.
  User: Alilestera
  Date: 2/11/2022
  Time: 11:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${requestScope.get("name")}
    ${requestScope.get("age")}
    ${requestScope.get("org.springframework.web.servlet.HandlerMapping.bestMatchingPattern")}
</body>
</html>
