<%@page import="com.service.FlightAdminServiceImple"%>
<%@page import="com.service.FlightAdminService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:useBean id="flight" class="com.dto.Flight" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="flight"/>

<%
	FlightAdminService flightAdminService = new FlightAdminServiceImple();
	int prevBookedSeats = Integer.parseInt(request.getParameter("prevBookedSeats"));
	int totalBookedSeats = prevBookedSeats + flight.getBookedSeats(); 
	int booked  =  flightAdminService.updateBookedSeatsNo(flight.getFlightNo(), totalBookedSeats);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking Confirmed</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
	<div class="container-fluid " style="height:100vh;">
		<div class="row justify-content-center align-items-center" style="margin-top: 300px">
			<div class="col">
				<div class="d-flex flex-column justify-content-center align-items-center">
					<div class="jumbotron-fluid d-flex justify-content-center align-items-center">
						<h1>Booking Confirmed</h1>
					</div>
				<a href="home.jsp" style="margin-top: 100px" class="col-6 btn-lg btn btn-primary btn-block" role="button">Go to Home Page</a>
				</div>
			</div>
		</div>
	</div>
	

</body>
</html>