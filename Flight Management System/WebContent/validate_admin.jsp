<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>




<%
	session.setAttribute("user_name", "kunal");

	String userName = request.getParameter("userName");
	String userPass = request.getParameter("userPass");
	
	if(userName.equals("kunal") && userPass.equals("1234")){
		response.sendRedirect("admin_home.jsp");
	}
	else{
		response.sendRedirect("admin_login.jsp?error_msg=Invalid Credentials");
	}

%>