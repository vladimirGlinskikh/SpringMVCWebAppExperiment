<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="th" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="http://cdn.jsdelivr.net/webjars/bootstrap/5.1.3/css/bootstrap.min.css"
          th:href="@{/webjars/bootstrap/5.1.3/css/bootstrap.min.css}"
          rel="stylesheet" media="screen"/>
</head>
<body>
<div class="container">
    <div class="panel-heading">
        <h2 class="panel-title">All Employees</h2>
    </div>
    <table class="table table-bordered border-primary">
        <thead>
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>Department</th>
            <th>Salary</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="emp" items="${allEmps}">
            <tr>
                <td>${emp.name}</td>
                <td>${emp.surname}</td>
                <td>${emp.department}</td>
                <td>${emp.salary}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="addNewEmployee" class="btn btn-primary">Add</a>
</div>
<script src="http://cdn.jsdelivr.net/webjars/jquery/3.5.1/jquery.min.js"
        th:src="@{/webjars/jquery/3.5.1/jquery.min.js}"></script>
</body>
</html>
