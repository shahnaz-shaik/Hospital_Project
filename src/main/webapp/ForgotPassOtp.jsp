<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>OTP Validation Result</title>
    <style>
        .card {
            border: 1px solid #ccc;
            border-radius: 5px;
            padding: 20px;
            width: 300px;
            margin: 0 auto;
            text-align: center;
        }
        .btn {
            background-color: #007bff;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <div class="card">
        <h1>OTP Validation Result</h1>
        <% if ("success".equals(request.getAttribute("validationStatus"))) { %>
            <p>OTP validation successful. You can proceed.</p>
            <!-- Button for redirection -->
            <button class="btn" onclick="redirectToPage()">Proceed</button>
        <% } else { %>
            <p>OTP validation failed. Please try again.</p>
        <% } %>
    </div>

    <!-- JavaScript function to redirect to login.jsp -->
    <script>
    function redirectToPage() {
        
            window.location.href = "newpass.jsp";
    }
    </script>
</body>
</html>
