<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>askTitle</title>
</head>
<body>
<h2>Please enter your details</h2>
<br>
<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <br>
    Surname <form:input path="surname"/>
    <br>
    Salary <form:input path="salary"/>
    <br>
    Department
    <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select>
    <br>
    Which work version do you want?
    <form:radiobuttons path="workVersion" items="${employee.workVersions}"/>
    <br>
    Foreign Language(s)
    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <input type="submit" value="OK">
</form:form>
</body>
</html>
