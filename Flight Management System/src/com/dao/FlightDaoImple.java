package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.conn.MySQLCon;
import com.dto.Flight;

public class FlightDaoImple implements FlightDao {

	private MySQLCon myCon;
	
	public FlightDaoImple() {
		myCon = new MySQLCon();
	}
	
	
	@Override
	public int addFlight(Flight flight) {
		
		int insertedRows = 0;
		Connection con = myCon.getConn();
		PreparedStatement s;
		try {
			s = con.prepareStatement("insert into flight (flight_no, flight_to, flight_from, "
					+ "flight_date, flight_time, no_of_seats, booked_seats, amount) values(?,?,?,?,?,?,?,?)");
			System.out.println(flight);
			s.setInt(1, flight.getFlightNo());
			s.setString(2, flight.getFlightTo());
			s.setString(3, flight.getFlightFrom());
			s.setString(4,  flight.getDate());
			s.setString(5, flight.getTime());
			s.setInt(6, flight.getNoOfSeats());
			s.setInt(7, flight.getBookedSeats());
			s.setFloat(8, flight.getAmount());
			
			insertedRows = s.executeUpdate();
			s.close();
		} catch (SQLException e) {
			System.out.println("SQL EXCEPTION IN DTO ADD FLIGHT");
			e.printStackTrace();
		}
		
		return insertedRows;
	}

	@Override
	public int updateFlightDetails(Flight flight) {
		
		int updatedRows = 0;
		Connection con = myCon.getConn();
		PreparedStatement s;
		try {
			s = con.prepareStatement("update flight set flight_to=?, flight_from=?,"
					+ "flight_date=?, flight_time=?, no_of_seats=?, booked_seats=?, amount=? where flight_no=?");
			System.out.println(flight);
			s.setString(1, flight.getFlightTo());
			s.setString(2, flight.getFlightFrom());
			s.setString(3,  flight.getDate());
			s.setString(4, flight.getTime());
			s.setInt(5, flight.getNoOfSeats());
			s.setInt(6, flight.getBookedSeats());
			s.setFloat(7, flight.getAmount());
			s.setInt(8, flight.getFlightNo());
			
			updatedRows = s.executeUpdate();
			s.close();
		} catch (SQLException e) {
			System.out.println("SQL EXCEPTION IN DTO UPDATE FLIGHT");
			e.printStackTrace();
		}
		
		return updatedRows;
	}

	@Override
	public int deleteFlight(int flightNo){
		int deletedRows = 0;
		try {
		Connection con = myCon.getConn();
		PreparedStatement s = con.prepareStatement("delete from flight where flight_no = ?");
		s.setInt(1, flightNo);
		deletedRows = s.executeUpdate();
		s.close();
		}catch (SQLException e) {
			System.out.println("SQL EXCEPTION IN DTO DELETE FLIGHT");
			e.printStackTrace();
		}
		return deletedRows;
	}

	@Override
	public ArrayList<Flight> showFlights() {
		ArrayList<Flight> allFLightsList = new ArrayList<>();
		try {
		Connection con = myCon.getConn();
		PreparedStatement s = con.prepareStatement("select * from flight");
		ResultSet rs = s.executeQuery();
		while(rs.next()) {
			Flight f = new Flight();
			f.setFlightNo(rs.getInt("flight_no"));
			f.setFlightTo(rs.getString("flight_to"));
			f.setFlightFrom(rs.getString("flight_from"));
			f.setDate(rs.getString("flight_date"));
			f.setTime(rs.getString("flight_time"));
			f.setNoOfSeats(rs.getInt("no_of_seats"));
			f.setBookedSeats(rs.getInt("booked_seats"));
			f.setAmount(rs.getFloat("amount"));
			allFLightsList.add(f);
		}
		s.close();
		}catch ( SQLException e) {
			System.out.println("SQL EXCEPTION IN DTO SHOW FLIGHT");
			e.printStackTrace();
		}
		
		return allFLightsList;

	}


	@Override
	public Flight getFlightUpdateInfo(int flightNo) {
		Flight updateFlightInfo = new Flight();
		
		try {
			Connection con = myCon.getConn();
			PreparedStatement s = con.prepareStatement("select * from flight where flight_no=?");
			s.setInt(1, flightNo);
			ResultSet rs = s.executeQuery();
			if(rs.next()) {
				updateFlightInfo.setFlightNo(rs.getInt("flight_no"));
				updateFlightInfo.setFlightTo(rs.getString("flight_to"));
				updateFlightInfo.setFlightFrom(rs.getString("flight_from"));
				updateFlightInfo.setDate(rs.getString("flight_date"));
				updateFlightInfo.setTime(rs.getString("flight_time"));
				updateFlightInfo.setNoOfSeats(rs.getInt("no_of_seats"));
				updateFlightInfo.setBookedSeats(rs.getInt("booked_seats"));
				updateFlightInfo.setAmount(rs.getFloat("amount"));
			}
			s.close();
			}catch ( SQLException e) {
				System.out.println("SQL EXCEPTION IN DTO UPDATE INFO SINGLE FLIGHT");
				e.printStackTrace();
			}

		return updateFlightInfo;
	}


	@Override
	public ArrayList<Flight> toFlights() {
		ArrayList<Flight> toFLightList = new ArrayList<>();
		try {
		Connection con = myCon.getConn();
		PreparedStatement s = con.prepareStatement("select flight_to from flight");
		ResultSet rs = s.executeQuery();
		while(rs.next()) {
			Flight f = new Flight();
			f.setFlightTo(rs.getString("flight_to"));
			toFLightList.add(f);
		}
		s.close();
		}catch ( SQLException e) {
			System.out.println("SQL EXCEPTION IN DTO TO FLIGHT");
			e.printStackTrace();
		}
		
		return toFLightList;
	}


	@Override
	public ArrayList<Flight> fromFlights() {
		ArrayList<Flight> fromFLightList = new ArrayList<>();
		try {
		Connection con = myCon.getConn();
		PreparedStatement s = con.prepareStatement("select flight_from from flight");
		ResultSet rs = s.executeQuery();
		while(rs.next()) {
			Flight f = new Flight();
			f.setFlightFrom(rs.getString("flight_from"));
			fromFLightList.add(f);
		}
		s.close();
		}catch ( SQLException e) {
			System.out.println("SQL EXCEPTION IN DTO TO FLIGHT");
			e.printStackTrace();
		}
		
		return fromFLightList;
	}


	@Override
	public ArrayList<Flight> searchUserFlight(String to, String from, String date) {
		
		ArrayList<Flight> userFLightsList = new ArrayList<>();
		try {
		Connection con = myCon.getConn();
		PreparedStatement s = con.prepareStatement("select * from flight where flight_to=? and flight_from=? and flight_date=?");
		s.setString(1, to);
		s.setString(2, from);
		s.setString(3, date);
		
		System.out.println(s);
		
		ResultSet rs = s.executeQuery();
		
		while(rs.next()) {
			Flight f = new Flight();
			f.setFlightNo(rs.getInt("flight_no"));
			f.setFlightTo(rs.getString("flight_to"));
			f.setFlightFrom(rs.getString("flight_from"));
			f.setDate(rs.getString("flight_date"));
			f.setTime(rs.getString("flight_time"));
			f.setNoOfSeats(rs.getInt("no_of_seats"));
			f.setBookedSeats(rs.getInt("booked_seats"));
			f.setAmount(rs.getFloat("amount"));
			userFLightsList.add(f);
		}
		System.out.println(userFLightsList);
		s.close();
		}catch ( SQLException e) {
			System.out.println("SQL EXCEPTION IN DTO userFLightsList FLIGHT");
			e.printStackTrace();
		}
		
		return userFLightsList;
	}


	@Override
	public int updateBookedSeats(int flightNo, int bookedSeats) {
		
		int updatedRows=0;
		
		try {
			Connection con = myCon.getConn();
			PreparedStatement s = con.prepareStatement("update flight set booked_seats=? where flight_no=?");
			s.setInt(1, bookedSeats);
			s.setInt(2, flightNo);
			updatedRows = s.executeUpdate();
			
			s.close();
			}catch ( SQLException e) {
				System.out.println("SQL EXCEPTION IN DTO UPDATE BOOKED SEATS");
				e.printStackTrace();
			}
		return updatedRows;
		
	}


	

}
