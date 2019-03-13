<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <div style="width: 300px; height: 500px;">
        <form:form method="POST" action="/home" modelAttribute="user">
            <h3 align="center" style="color:maroon;">Don't hesitate, add a user!</h3>

            <br align="left">
                <label>Name</label>
                <input type="text" name="name" required="required"/> </br>

                <label>Age</label>
                <input type="number" name="age" required="required"/>

                <div align="center">
                    <input type="radio" name="gender" value="FEMALE"> FEMALE
                    <input type="radio" name="gender" value="MALE"> MALE
                    <br>
                </div>

                <button type="submit">ADD</button>
            </div>
        </form:form>
    </div>
</div>
</body>
</html>
