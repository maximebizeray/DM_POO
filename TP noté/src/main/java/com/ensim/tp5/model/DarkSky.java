package com.ensim.tp5.model;

public class DarkSky {

	private float latitude;
	 private float longitude;
	 private float offset;
	private String Timezone;
	Data donnees;
	
	
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public float getOffset() {
		return offset;
	}
	public void setOffset(float offset) {
		this.offset = offset;
	}
	public String getTimezone() {
		return Timezone;
	}
	public void setTimezone(String timezone) {
		Timezone = timezone;
	}
	public Data getDonnees() {
		return donnees;
	}
	public void setDonnees(Data donnees) {
		this.donnees = donnees;
	}
	
	
}

