<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%
	int flightNo = Integer.parseInt(request.getParameter("flightNo"));
	int prevBookedSeats = Integer.parseInt(request.getParameter("bookedSeats"));
%>
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Seats</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
 <div class="container-fluid">
	<div class="row">
		<div class="col">
			<form action="book.jsp">
				<div class="form-group">
		    		<label for="formGroupExampleInput">Flight No :</label>
		    		<input type="number" class="form-control" value="<%=flightNo%>" name="flightNo" id="formGroupExampleInput" placeholder="Enter no of seats" readonly>
		  		</div>
				
				
		  		<div class="form-group">
		    		<label for="formGroupExampleInput">Enter No Of seats :</label>
		    		<input type="number" class="form-control" name="bookedSeats" id="formGroupExampleInput" placeholder="Enter no of seats">
		  		</div>
		  		
		  		<div class="form-group">
		    		<input type="hidden" class="form-control" name="prevBookedSeats" value="<%=prevBookedSeats %>"  id="formGroupExampleInput" placeholder="Enter no of seats" readonly>
		  		</div>
  		
  		
  			<button type="submit" class="btn btn-primary">Submit</button>
 		
		</form>
		</div>
	</div>
  </div>
	
</body>
</html>