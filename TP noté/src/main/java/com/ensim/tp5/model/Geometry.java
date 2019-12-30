package com.ensim.tp5.model;

import java.util.ArrayList;

public class Geometry {

    private String type;
	ArrayList<Double>coordinates = new ArrayList<Double>();
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ArrayList<Double> getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(ArrayList<Double> coordinates) {
		this.coordinates = coordinates;
	}
	
	
}
