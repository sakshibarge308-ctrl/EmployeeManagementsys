<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
<h1 class="text-center display-5">Employee Project Data</h1>
<table class="table table-bordered">
<thead>
<tr>
<th>Employee Id</th>
<th>Name</th>
<th>Department</th>
<th>Salary</th>
<th>Project Id</th>
<th>Project Name</th>
<th>Budget</th>

</tr>
</thead>
<tbody>
<c:forEach items="${list}" var="row">
<tr>
<td>${row.id}</td>
<td>${row.name}</td>
<td>${row.dept}</td>
<td>${row.salary}</td>
<td>${row.pid}</td>
<td>${row.pname}</td>
<td>${row.budget}</td>
<td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</body>
</html>