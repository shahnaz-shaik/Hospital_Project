<%@page import="com.db.DBConnect"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index Page</title>
<%@include file="component/allcss.jsp" %>
<style type="text/css">
body {
    background-color: #d9d9d9; 
    background-size: cover;
    background-position: center; 
    background-repeat: repeat;
  }
.paint-card {
	background-color: #333333;
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
.centered {
    display: flex;
    justify-content: center;
    align-items: center;
}
.mapmain{
	height:100%;
	justify-content: space-around;
	margin: 3%;
	padding: 3%;
}

.map{
	width:50%;
    float:right;
    height:500px;
   
}
.mapillustration{
	width:50%;
		   float:left;
		   height:500px;
}

.carousel-caption {
  position: absolute;
  right: 60%;
  top: 50%;
  transform: translateY(-70%);
    font-family: cursive;
}


</style>
</head>
<body>

 <%@include file="component/navbar.jsp" %>
 
 <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel" style=" margin-top: 0px;">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
  </div>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="https://wallpaperaccess.com/full/4088661.jpg  " class="d-block w-100" alt="..."  height="800px">
      <div class="carousel-caption d-none d-md-block">
    <h1 style="display: block;">Your Time Matters</h1>
    <h1 style="display: block;">Simplifying Appointment Booking for Better Healthcare Access.</h1>
</div>
      
    </div>
       <div class="carousel-item">
      <img src="https://wallpaperaccess.com/full/6369949.jpg" class="d-block w-100" alt="..." height="800px">
    </div>
    <div class="carousel-item">
      <img src="https://wallpaperaccess.com/full/5004791.jpg" class="d-block w-100" alt="..." height="800px">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>
<div class="container p-3">
		<p class="text-center fs-2 text-black">Key Features of our Hospital</p>

		<div class="row centered">
			<div class="col-md-8 p-5">
				<div class="row">
					<div class="col-md-6">
						<div class="card paint-card text-white">
							<div class="card-body">
								<p class="fs-5">100% Safety</p>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
									Voluptatem, inventore</p>
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="card paint-card text-white">
							<div class="card-body">
								<p class="fs-5">Clean Environment</p>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
									Voluptatem, inventore</p>
							</div>
						</div>
					</div>
					<div class="col-md-6 mt-2">
						<div class="card paint-card text-white">
							<div class="card-body">
								<p class="fs-5">Friendly Doctors</p>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
									Voluptatem, inventore</p>
							</div>
						</div>
					</div>
					<div class="col-md-6 mt-2">
						<div class="card paint-card text-white">
							<div class="card-body">
								<p class="fs-5">Medical Research</p>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
									Voluptatem, inventore</p>
							</div>
						</div>
					</div>
				</div>
			</div>
			
		</div>
	</div>	
	
	<hr>
	<div class="mapmain">
  <div class="map">
    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d122410.10175898601!2d80.57484332349684!3d16.510153135457976!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3a35eff9482d944b%3A0x939b7e84ab4a0265!2sVijayawada%2C%20Andhra%20Pradesh!5e0!3m2!1sen!2sin!4v1634675338784!5m2!1sen!2sin" width="100%" height="100%" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
    
  </div>
  <div class="mapillustration">
    <h1> REACH US</h1><br> <img src="https://blogs.mulesoft.com/wp-content/uploads/location-icon.png" alt="about illustration"
           style=" width:60%;height:70%;margin-right:15px;">
    
  </div>
</div>
	

	<div class="container p-2">
		<p class="text-center fs-2 text-black ">Our Team</p>
		
		<div class="row">
			<div class="col-md-3">
				<div class="card paint-card text-white">
					<div class="card-body text-center">
						<img src="img/111.png" width="250px" height="250px">
						<p class="fw-bold fs-5">Dr.Shahnaz Shaik</p>
						<p class="fs-7">(CEO & Chairman)</p>
					</div>
				</div>
			</div>

			<div class="col-md-3">
				<div class="card paint-card text-white">
					<div class="card-body text-center">
						<img src="img/212.jpg" width="250px" height="250px">
						<p class="fw-bold fs-5">Dr.Dharani Thumma</p>
						<p class="fs-7">(Chief Doctor)</p>
					</div>
				</div>
			</div>

			<div class="col-md-3">
				<div class="card paint-card text-white">
					<div class="card-body text-center">
						<img src="img/doc2.jpg" width="250px" height="300px">
						<p class="fw-bold fs-5">Dr. Niuise Paule</p>
						<p class="fs-7">(Chief Doctor)</p>
					</div>
				</div>
			</div>

			<div class="col-md-3">
				<div class="card paint-card text-white">
					<div class="card-body text-center">
						<img src="img/doc3.jpg" width="250px" height="300px">
						<p class="fw-bold fs-5">Dr. Mathue Samuel</p>
						<p class="fs-7">(Chief Doctor)</p>
					</div>
				</div>
			</div>

		</div>

	</div>
	
<%@include file="component/footer.jsp" %>
	
</body>
</html>