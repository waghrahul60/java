package com.service;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.dto.Flight;

public interface FlightAdminService {
	
	int addFlightService(Flight flight);
	
	int updateFlightService(Flight flight);
	
	int deleteFlightService(int flightNo);
	
	ArrayList<Flight> displayAllFlights();
	
	Flight getFlightUpdateInfo(int flightNo);
	
	ArrayList<Flight> getAllToFlights();
	
	ArrayList<Flight> getAllFromFlights();
	
	ArrayList<Flight> userFlights(String to, String from, String date);
	
	int updateBookedSeatsNo(int flightNo, int bookedSeats);
		
}
