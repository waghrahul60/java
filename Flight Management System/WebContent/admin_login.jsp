<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
	<div class="container-fluid">
	
		<div class="d-flex flex-column jumbotron justify-content-center align-items-center bg-secondary">
			<h1>Admin Login</h1>
		</div>
	
		<div class="row">
			<div class="col-md-3 col-12">
				
			</div>
			
			<div class="col-md-6 col-12">
			
				<form action="validate_admin.jsp">
		  			<div class="form-group">
		    			<label for="exampleInputEmail1">Admin Username : </label>
		    			<input type="text" class="form-control" id="exampleInputEmail1" name="userName" aria-describedby="emailHelp">
		    			<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
		  			</div>
			  		<div class="form-group">
			    			<label for="exampleInputPassword1">Admin Password</label>
			    			<input type="password" class="form-control" id="exampleInputPassword1" name="userPass">
			  		</div>
		  	
		  			<button type="submit" class="btn btn-primary">Submit</button>
		  
				</form>
				
			</div>
			
			<div class="col-md-3 col-12">
				
			</div>
			
			
		</div>



		
	</div>
</body>
</html>


