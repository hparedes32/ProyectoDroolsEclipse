package com.sample;

import java.util.ArrayList;
import java.util.List;

public class GroupsOfFlights {

	private String internalGDSKey;

	private List<Flights> flights;

	public String getInternalGDSKey() {
		return internalGDSKey;
	}

	public void setInternalGDSKey(String internalGDSKey) {
		this.internalGDSKey = internalGDSKey;
	}

	public List<Flights> getFlights() {
		return flights;
	}

	public void setFlights(List<Flights> flights) {
		this.flights = flights;
	}

	
}