<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="component/allcss.jsp"%>
<style type="text/css">
    body {
        background-image: url('https://github.com/opprDev/medical-image-downloader/blob/master/assets/banner_1280x640.png?raw=true');
        /* Change 'path/to/your/image.jpg' to the actual path of your image */
        background-size: cover;
        /* Cover the entire background */
        background-position: center;
        /* Center the background image */
        background-repeat: repeat;
    }

    .paint-card {
        box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
    }
</style>
</head>
<body>
<%@include file="component/navbar.jsp"%>

<div class="container p-5">
    <div class="row">
        <div class="col-md-4 offset-md-4">
            <div class="card paint-card">
                <div class="card-body">
                    <p class="fs-4 text-center">User Register</p>

                    <c:if test="${not empty sucMsg }">
                        <p class="text-center text-info fs-3">${sucMsg}</p>
                        <c:remove var="sucMsg" scope="session" />
                    </c:if>

                    <c:if test="${not empty errorMsg }">
                        <p class="text-center text-danger fs-3">${errorMsg}</p>
                        <c:remove var="errorMsg" scope="session" />
                    </c:if>

                    <form id="registerForm" action="user_register" method="post">
                        <div class="mb-3">
                            <label class="form-label">First Name</label> <input required name="firstname" type="text" class="form-control">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Last Name</label> <input required name="lastname" type="text" class="form-control">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Email address</label> <input required name="email" type="email" class="form-control">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Password </label> 
    <input required name="password" type="password" class="form-control" 
           pattern="^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$" 
           title="Password must be at least 8 characters long and contain at least one letter, one number, and one special character">
                        </div>
                        <button type="submit" class="btn bg-dark text-white col-md-12">Register</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- 
<script>
    function registerAndSendEmail() {
        // Submit the form to user_register servlet
        var form = document.getElementById("registerForm");
        form.action = "user_register";
        form.submit();

        // Send email asynchronously using AJAX
        var xhr = new XMLHttpRequest();
        xhr.open("POST", "SendEmailServlet", true);
        xhr.send(new FormData(form));
    }
</script> -->

</body>
</html>
