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
<title>Admin Home</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>

	<div class="container-fluid">
	
		<div class="d-flex flex-column jumbotron justify-content-center align-items-center bg-secondary">
			<h1>Admin Home</h1>
		</div>
	
		<div class="row" style="margin-top: 100px">
			<div class="col-md-3 col-12">
				
			</div>
			
			<div class="col-md-6 col-12">
			
				
				<div class="row justify-content-center">
					
					<div class="col-6 row justify-content-center">
						<button class="btn btn-lg btn-warning"><a href="add_flight_form.jsp">Add Flights</a></button>
					</div>
					
					<div class="col-6 row justify-content-center">
						<button class="btn btn-lg btn-warning"><a href="list_flight_form.jsp">Show Flights</a></button>
					</div>
					
				</div>

			</div>
			
			<div class="col-md-3 col-12">
				
			</div>
			
			
		</div>



		
	</div>

	
	
</body>
</html>


<%
	}
	else
	{
		response.sendRedirect("admin_login.jsp");
	}

%>