package com.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.dto.Flight;

public interface FlightDao {
	
	int addFlight(Flight flight);
	
	int updateFlightDetails(Flight flight);
	
	int deleteFlight(int flightNo);
	
	ArrayList<Flight> showFlights();
	
	Flight getFlightUpdateInfo(int flightNo);
	
	ArrayList<Flight> toFlights();
	
	ArrayList<Flight> fromFlights();
	
	ArrayList<Flight> searchUserFlight(String to, String from, String date);
	
	int updateBookedSeats(int flightNo, int bookedSeats);
	
	
	
}
