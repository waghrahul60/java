package com.service;

import java.util.ArrayList;

import com.dao.FlightDao;
import com.dao.FlightDaoImple;
import com.dto.Flight;

public class FlightAdminServiceImple implements FlightAdminService {

	private FlightDao flightDao;
	
	public FlightAdminServiceImple() {
		flightDao = new  FlightDaoImple();
	}
	
	
	@Override
	public int addFlightService(Flight flight) {
		return flightDao.addFlight(flight);
	}

	@Override
	public int updateFlightService(Flight flight) {
		return flightDao.updateFlightDetails(flight);
	}

	@Override
	public int deleteFlightService(int flightNo) {
		return flightDao.deleteFlight(flightNo);
	}
	
	
	@Override
	public ArrayList<Flight> displayAllFlights() {
		return flightDao.showFlights();
	}
	
	@Override
	public Flight getFlightUpdateInfo(int flightNo) {
		return flightDao.getFlightUpdateInfo(flightNo);
	}


	@Override
	public ArrayList<Flight> getAllToFlights() {
		return flightDao.toFlights();
	}


	@Override
	public ArrayList<Flight> getAllFromFlights() {
		return flightDao.fromFlights();
	}


	@Override
	public ArrayList<Flight> userFlights(String to, String from, String date) {
		return flightDao.searchUserFlight(to, from, date);
	}


	@Override
	public int updateBookedSeatsNo(int flightNo, int bookedSeats) {
		return flightDao.updateBookedSeats(flightNo, bookedSeats);
	}

}
