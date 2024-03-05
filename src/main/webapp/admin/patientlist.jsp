<%@page import="com.entity.User"%>
<%@page import="com.dao.UserDao"%>

<%@page import="java.util.List"%>
<%@page import="com.db.DBConnect"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Patient</title>
<%@include file="../component/allcss.jsp"%>
<style type="text/css">
body {
    background-image: url('https://getwallpapers.com/wallpaper/full/8/0/f/7125.jpg'); 
    background-size: cover; 
    
    background-position: center; 
    background-repeat: no-repeat;
    
   
  }
.paint-card {
	 box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3); 
}
</style>
</head>
<body>
	<%@include file="navbar.jsp"%>
	<div class="container-fluid p-3">
		<div class="row">


			<div class="col-md-12">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-3 text-center">Patient Details</p>
						<c:if test="${not empty errorMsg}">
							<p class="fs-3 text-center text-danger">${errorMsg}</p>
							<c:remove var="errorMsg" scope="session" />
						</c:if>
						<c:if test="${not empty succMsg}">
							<div class="fs-3 text-center text-success" role="alert">${succMsg}</div>
							<c:remove var="succMsg" scope="session" />
						</c:if>
						<table class="table">
							<thead>
								<tr>
									<th scope="col">First Name</th>
									<th scope="col">Last Name</th>
									<th scope="col">Email</th>
									
								</tr>
							</thead>
							<tbody>
								<%
								UserDao dao2 = new UserDao(DBConnect.getConn());
								List<User> list2 = dao2.getAllUser();
								for (User u : list2) {
								%>
								<tr>
									<td><%=u.getFirstName()%></td>
									<td><%=u.getLastName()%></td>
									<td><%=u.getEmail()%></td>
									
									
								</tr>
								<%
								}
								%>



							</tbody>
						</table>

					</div>
				</div>
			</div>

		</div>
	</div>
</body>
</html>