package com.sample;

public class Flights {

	private String marketingCarrier;

	private int flightNumber;


	public Flights(String marketingCarrier, int flightNumber) {
		super();
		this.marketingCarrier = marketingCarrier;
		this.flightNumber = flightNumber;
	}


	public String getMarketingCarrier() {
		return marketingCarrier;
	}


	public void setMarketingCarrier(String marketingCarrier) {
		this.marketingCarrier = marketingCarrier;
	}


	public int getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	

}