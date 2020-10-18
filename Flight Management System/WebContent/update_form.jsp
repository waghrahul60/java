<%@page import="com.service.FlightAdminServiceImple"%>
<%@page import="com.service.FlightAdminService"%>
<%@page import="com.dto.Flight" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ include file="cache_control.jsp"  %>
<%@ include file="admin_header.jsp"  %>


<%
	String user_name = session.getAttribute("user_name").toString();
	if(user_name!=null && user_name.equals("kunal")){
%>


<%
	int flightNo = Integer.parseInt(request.getParameter("flightNo"));
	FlightAdminService flightAdminService = new FlightAdminServiceImple();
	Flight updateFlight = flightAdminService.getFlightUpdateInfo(flightNo);
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Form</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
	<form action="update.jsp">
	
  		<div class="form-group">
    		<label for="formGroupExampleInput">Flight No : </label>
    		<input type="number" class="form-control" name="flightNo" value="<%=updateFlight.getFlightNo()%>" id="formGroupExampleInput" placeholder="Enter Flight No" readonly>
  		</div>
  		
  		<div class="form-group">
    		<label for="formGroupExampleInput2">To : </label>
    		<input type="text" class="form-control" name="flightTo" id="formGroupExampleInput2" value="<%=updateFlight.getFlightTo()%>" placeholder="Enter Destination">
 		</div>
 		
 		<div class="form-group">
    		<label for="formGroupExampleInput2">From : </label>
    		<input type="text" class="form-control" name="flightFrom" id="formGroupExampleInput2" value="<%=updateFlight.getFlightFrom()%>" placeholder="Enter Source">
 		</div>
 		
 		<div class="form-group">
    		<label for="formGroupExampleInput2">Date : </label>
    		<input type="text" class="form-control" name="date" id="formGroupExampleInput2" value="<%=updateFlight.getDate()%>" placeholder="YYYY-MM-DD">
 		</div> 		
 		
 		
 		<div class="form-group">
    		<label for="formGroupExampleInput2">Time : </label>
    		<input type="text" class="form-control" name="time" id="formGroupExampleInput2" value="<%=updateFlight.getTime()%>" placeholder="HH:MM AM/PM">
 		</div>
 		
 		<div class="form-group">
    		<label for="formGroupExampleInput2">No of Seats : </label>
    		<input type="number" class="form-control" name="noOfSeats" id="formGroupExampleInput2" value="<%=updateFlight.getNoOfSeats()%>" placeholder="Total Number of Seats">
 		</div>
 		
 		<div class="form-group">
    		<label for="formGroupExampleInput2">Booked Seats : </label>
    		<input type="number" class="form-control" name="bookedSeats" id="formGroupExampleInput2" value="<%=updateFlight.getBookedSeats()%>" placeholder="Booked Seats">
 		</div>
 		
 		<div class="form-group">
    		<label for="formGroupExampleInput2">Amount : </label>
    		<input type="number" class="form-control" name="amount" id="formGroupExampleInput2" value="<%=updateFlight.getAmount()%>" placeholder="Amount">
 		</div>
 		
 		<button type="submit" class="btn btn-primary">Update</button>
 		
	</form>
</body>
</html>

<%
	}else{
		response.sendRedirect("admin_login.jsp");
	}

%>