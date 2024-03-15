<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="../component/allcss.jsp"%>

<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>
</head>
<body>
	<%@include file="../component/navbar.jsp"%>

	

	<div class="container p-4">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card paint-card p-5">
					<p class="text-center fs-3">NEW PASSWORD</p>
					

					<c:if test="${not empty succMsg }">
						<p class="text-center text-info fs-3">${succMsg}</p>
						<c:remove var="succMsg" scope="session" />
					</c:if>

					<c:if test="${not empty errorMsg }">
						<p class="text-center text-danger fs-5">${errorMsg}</p>
						<c:remove var="errorMsg" scope="session" />
					</c:if>
					<div class="card-body">
						<form id="" action="../new_password_doc" method="post">
						<div class="mb-3">
								<label>Email</label> <input type="email"
									name="email" class="form-control" required>
							</div>
							<div class="mb-3">
								<label>Enter New Password</label> <input type="password"
									name="password" class="form-control" required>
							</div>
							<div class="mb-3">
								<label>Enter New Password Again</label> <input type="password"
									name="password2" class="form-control" required>
							</div>

							<%-- <input type="hidden" value="${userObj.id }" name="uid"> --%>
						
							<button type="submit" class="btn btn-info col-md-12">Submit</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>