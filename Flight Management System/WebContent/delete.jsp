<%@page import="com.service.FlightAdminServiceImple"%>
<%@page import="com.service.FlightAdminService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<%
	int flightNo = Integer.parseInt(request.getParameter("flightNo"));
	FlightAdminService flightAdminService = new FlightAdminServiceImple();
	flightAdminService.deleteFlightService(flightNo);
	response.sendRedirect("list_flight_form.jsp");
%>