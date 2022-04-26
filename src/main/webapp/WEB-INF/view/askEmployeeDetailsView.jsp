<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>askTitle</title>
</head>
<body>
<h2>Please enter your details</h2>
<br><br>
<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department
    <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>
    Which work version do you want?
    <form:radiobuttons path="workVersion" items="${employee.workVersions}"/>
    <br><br>
    Foreign Language(s)
    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <br><br>
    Phone Number
    <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>
