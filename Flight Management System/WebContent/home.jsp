<%@page import="java.util.ArrayList"%>
<%@page import="com.service.FlightAdminServiceImple"%>
<%@page import="com.service.FlightAdminService"%>
<%@page import="com.dto.Flight"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 
<%
	FlightAdminService flightAdminService = new  FlightAdminServiceImple();
	ArrayList<Flight> toList =  flightAdminService.getAllToFlights();
	ArrayList<Flight> fromList =  flightAdminService.getAllFromFlights();
%> 
  
  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
	<div class="container-fluid">
	
	
		
		<div class="d-flex flex-column justify-content-center align-items-center" >
		
		
		<div class="jumbotron d-flex justify-content-center align-items-center vw-100">
		<h1>FLIGHT SEARCH</h1>
		</div>
		
		<form action="book_flight_form.jsp" class="d-flex justify-content-center align-items-center" style="width: 80vw; border:5px solid black">
			<div class="row d-flex justify-content-center align-items-center" style="height: 30vh; width:80%;">
			
			
			
			<div class="col">
				<div class="input-group mb-3">
				
	  				<div class="input-group-prepend">
	    				<label class="input-group-text" for="inputGroupSelect01">Choose Source </label>
					</div>
					
					<select class="custom-select" name="flightFrom" id="inputGroupSelect01">
					    <option selected>Choose...</option>
					    <% for(Flight f : fromList) {%>
					    <option  value="<%=f.getFlightFrom()%>"><%=f.getFlightFrom()%></option>
					    <%} %>
					 </select>
					 
				</div>
			
			</div>
			
			
			<div class="col">
				<div class="input-group mb-3">
				
	  				<div class="input-group-prepend">
	    				<label class="input-group-text" for="inputGroupSelect01">Choose Destination </label>
					</div>
					
					<select class="custom-select" name="flightTo" id="inputGroupSelect01">
					    <option selected>Choose...</option>
					    <% for(Flight f : toList) {%>
					    <option  value="<%=f.getFlightTo()%>"><%=f.getFlightTo()%></option>
					    <%} %>
					 </select>
					 
				</div>
			</div>
			
			
			<div class="col">
				<div class="input-group mb-3">
				
	  				<div class="input-group-prepend">
	    				<label class="input-group-text" for="inputGroupSelect01">Choose Date </label>
					</div>
					
					<input type="text" placeholder="Format YYYY/MM/DD" name="date">
					 
				</div>
				
			</div>
		
		</div>
		
		<button type="submit" class="col-2 ml-0 pl-0  btn-lg  btn-block btn-primary">SEARCH</button>
		
		</form>

		</div>
		
			
	</div>
</body>
</html>