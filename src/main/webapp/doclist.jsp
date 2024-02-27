<%@page import="com.entity.User"%>
<%@page import="com.entity.Doctor"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.DoctorDao"%>
<%@page import="com.db.DBConnect"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Doctors</title>
<%@include file="component/allcss.jsp"%>
<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}

.backImg {
	background: linear-gradient(rgba(0, 0, 0, .4), rgba(0, 0, 0, .4)),
		url("img/hos3.jpg");
	height: 20vh;
	width: 100%;
	background-size: cover;
	background-repeat: no-repeat;
}
</style>
</head>
<body>
    
    <%@include file="component/navbar.jsp"%>
    <div class="container-fulid backImg p-5">
		<p class="text-center fs-2 text-white"></p>
	</div>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h2 class="text-center">List of Doctors</h2>
                <table class="table">
                    <thead>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">First Name</th>
                            <th scope="col">Last Name</th>
                            <th scope="col">Date of Birth</th>
                            <th scope="col">Qualification</th>
                            <th scope="col">Specialist</th>
                            <th scope="col">Email</th>
                            <th scope="col">Mobile No</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% 
                        User user = (User) session.getAttribute("userObj");
                        DoctorDao doctorDao = new DoctorDao(DBConnect.getConn());
                        List<Doctor> doctors = doctorDao.getAllDoctor();
                        for (Doctor doctor : doctors) { 
                        %>
                        <tr>
                            <td><%= doctor.getId() %></td>
                            <td><%= doctor.getFirstName() %></td>
                             <td><%= doctor.getLastName() %></td>
                            <td><%= doctor.getDob() %></td>
                            <td><%= doctor.getQualification() %></td>
                            <td><%= doctor.getSpecialist() %></td>
                            <td><%= doctor.getEmail() %></td>
                            <td><%= doctor.getMobNo() %></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
