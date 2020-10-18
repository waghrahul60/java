<%@page import="com.service.FlightAdminServiceImple"%>
<%@page import="com.service.FlightAdminService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:useBean id="flight" class="com.dto.Flight" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="flight"/>

<%
	FlightAdminService flightAdminService = new FlightAdminServiceImple();
	flightAdminService.updateFlightService(flight);
	response.sendRedirect("list_flight_form.jsp");
%>