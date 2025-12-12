<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 11/12/2025
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sinh Vien List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container py-5">
    <h2 class="text-center mb-4">SinhVien List</h2>

    <table class="table table-bordered table-hover table-striped shadow-sm">
        <thead class="table-dark text-center">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Date of Birth</th>
            <th>Score</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${sinhviens}" var="sinhvien">
            <tr>
                <td>${sinhvien.id}</td>
                <td>${sinhvien.name}</td>
                <td>${sinhvien.dob}</td>
                <td>${sinhvien.score}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
