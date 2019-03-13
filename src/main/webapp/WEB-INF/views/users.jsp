<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>

<h3>All users name:</h3>
${fn:length(userList)}
<div>
    <div>
        <c:forEach items="${userList}" var="user">
            <p>${user.name} ${user.age}</p>
        </c:forEach>
    </div>
</div>
</body>
</html>
