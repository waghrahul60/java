package com.dto;

import java.sql.Date;
import java.sql.Time;

public class Flight {
	
	private int flightNo;
	private String flightTo;
	private String flightFrom;
	private String date;
	private String time;
	private int noOfSeats;
	private int bookedSeats;
	private float amount;
	
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	
	
	public String getFlightTo() {
		return flightTo;
	}
	public void setFlightTo(String flightTo) {
		this.flightTo = flightTo;
	}
	
	public String getFlightFrom() {
		return flightFrom;
	}
	public void setFlightFrom(String flightFrom) {
		this.flightFrom = flightFrom;
	}
	
	
	public String getDate() {
		return date;
	}	
	public void setDate(String date) {
		this.date = date;
	}
	
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	
	public int getBookedSeats() {
		return bookedSeats;
	}
	public void setBookedSeats(int bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	
	
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
	
	
	//tostring method
	
	@Override
	public String toString() {
		return "flightNo : " + flightNo + "| flightTo : " + flightTo + "|  flightFrom : " + flightFrom + "|  date= "
				+ date + "| time : " + time + "| noOfSeats : " + noOfSeats + "| bookedSeats : " + bookedSeats + "| amount : "
				+ amount;
	}
	
	
	
	
}
