<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="component/allcss.jsp"%>

<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>
</head>
<body>
	<%@include file="component/navbar.jsp"%>

	

	<div class="container p-4">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card paint-card p-5">
					<p class="text-center fs-3">FORGOT PASSWORD</p>
					

					<%-- <c:if test="${not empty errorMsg }">
						<p class="text-center text-danger fs-5">${errorMsg}</p>
						<c:remove var="errorMsg" scope="session" />
					</c:if> --%>
					<div class="card-body">
						<form id="forgot" action="forgot_password" method="post">
							<div class="mb-3">
								<label>Email</label> <input type="email"
									name="email" class="form-control" required>
							</div>

							
						
							<button type="submit" class="btn btn-info col-md-12">Send Email</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>