<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 
<%
	String user_name = session.getAttribute("user_name").toString();
	if(user_name!=null && user_name.equals("kunal")){
%>
 
    
<%@ include file="cache_control.jsp"  %>
<%@ include file="admin_header.jsp"  %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Flight</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>

	<div class="container-fluid">
	
		<div class="jumbotron d-flex justify-content-center align-items-center bg-secondary">
			<h1>ADD FLIGHTS</h1>
		</div>
		
		<div class="row">
			
			<div class="col-3">
			
			</div>
			
			<div class="col-6">
					<form action="add_flight.jsp">
	
				  		<div class="form-group">
				    		<label for="formGroupExampleInput">Flight No : </label>
				    		<input type="number" class="form-control" name="flightNo" id="formGroupExampleInput" placeholder="Example input placeholder">
				  		</div>
				  		
				  		<div class="form-group">
				    		<label for="formGroupExampleInput2">To : </label>
				    		<input type="text" class="form-control" name="flightTo" id="formGroupExampleInput2" placeholder="Another input placeholder">
				 		</div>
				 		
				 		<div class="form-group">
				    		<label for="formGroupExampleInput2">From : </label>
				    		<input type="text" class="form-control" name="flightFrom" id="formGroupExampleInput2" placeholder="Another input placeholder">
				 		</div>
				 		
				 		<div class="form-group">
				    		<label for="formGroupExampleInput2">Date : </label>
				    		<input type="text" class="form-control" name="date" id="formGroupExampleInput2" placeholder="YYYY-MM-DD">
				 		</div> 		
				 		
				 		
				 		<div class="form-group">
				    		<label for="formGroupExampleInput2">Time : </label>
				    		<input type="text" class="form-control" name="time" id="formGroupExampleInput2" placeholder="HH:MM AM/PM">
				 		</div>
				 		
				 		<div class="form-group">
				    		<label for="formGroupExampleInput2">No of Seats : </label>
				    		<input type="number" class="form-control" name="noOfSeats" id="formGroupExampleInput2" placeholder="Another input placeholder">
				 		</div>
				 		
				 		<div class="form-group">
				    		<label for="formGroupExampleInput2">Booked Seats : </label>
				    		<input type="number" class="form-control" name="bookedSeats" id="formGroupExampleInput2" placeholder="Another input placeholder">
				 		</div>
				 		
				 		<div class="form-group">
				    		<label for="formGroupExampleInput2">Amount : </label>
				    		<input type="number" class="form-control" name="amount" id="formGroupExampleInput2" placeholder="Another input placeholder">
				 		</div>
				 		
				 		<button type="submit" class="btn btn-primary">Submit</button>
 		
					</form>
			</div>
			
			<div class="col-3">
			
			</div>
			
			
			
		</div>
	
	
	</div>
	
</body>
</html>


<%
	}else{
		response.sendRedirect("admin_login.jsp");
	}

%>