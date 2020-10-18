<%@page import="com.service.*" %>

<jsp:useBean id="flight" class="com.dto.Flight" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="flight"/>

<%
	FlightAdminService flightAdminService = new FlightAdminServiceImple();
	flightAdminService.addFlightService(flight);
	response.sendRedirect("add_flight_form.jsp");

%>