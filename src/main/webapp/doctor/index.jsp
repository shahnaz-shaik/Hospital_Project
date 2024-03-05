<%@page import="com.entity.Doctor"%>
<%@page import="com.db.DBConnect"%>
<%@page import="com.dao.DoctorDao"%>
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
body {
    background-image: url('https://th.bing.com/th/id/OIP.nBvhwPw3r8in90e0UT2e1gHaE8?w=626&h=418&rs=1&pid=ImgDetMain'); /* Change 'path/to/your/image.jpg' to the actual path of your image */
    background-size: cover; /* Cover the entire background */
    background-position: center; /* Center the background image */
    background-repeat: repeat;
   
   
   /* Do not repeat the background image */
  }
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
.custom-text {
        font-family: copperplate,fantasy; /* Change the font family */
        color: #ccffff; /* Change the text color to red */
    }


</style>
 </head>
<body>
     <c:if test="${empty doctObj }">
       <c:redirect url="../doctor_login.jsp"></c:redirect>
       </c:if>
 <%@include file="navbar.jsp"%>
<p class="text-center fs-3 custom-text">Doctor Dashboard</p>
<%
        Doctor d = (Doctor)session.getAttribute("doctObj");
		DoctorDao dao = new DoctorDao(DBConnect.getConn());
		%>
       <div class="container p-5">
		<div class="row">
			<div class="col-md-4 offset-md-2">
				<div class="card paint-card">
					<div class="card-body text-center text-dark">
						<i class="fas fa-user-md fa-3x"></i><br>
						<p class="fs-4 text-center">
							Doctor <br><%=dao.countDoctor() %>
						</p>
					</div>
				</div>
			</div>


			<div class="col-md-4">
				<div class="card paint-card">
					<div class="card-body text-center text-dark">
						<i class="far fa-calendar-check fa-3x"></i><br>
						<p class="fs-4 text-center">
							Total Appointment <br> <%=dao.countAppointmentByDocotrId(d.getId())%>
						</p>
					</div>
				</div>
			</div>

		</div>
	</div>
</body>
</html>