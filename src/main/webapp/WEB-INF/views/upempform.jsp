<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
</head>
</head>
<body>
<div class="container">
<h1 class="text-center display-5">Update Employees Here</h1>
<form:form action="saveemp" modelAttribute="emp">
 <div class="mb-3">
<label class="form-label">Id</label>
<form:input class="form-control" path="id" readonly="readonly"/>
</div> 

<div class="mb-3">
<label class="form-label">Name</label>
<form:input class="form-control" path="name"/>
</div>

<div class="mb-3">
<label class="form-label">Department</label>
<form:select class="form-control" path="dept">
<form:option value="sales">Sales</form:option>
<form:option value="purchase">Purchase</form:option>
</form:select>
</div>

<div class="mb-3">
<label class="form-label">Salary</label>
<form:input class="form-control" path="salary"/>
</div>
<input type="submit" class="btn btn-primary"/>
</form:form>
</div>

</body>
</html>