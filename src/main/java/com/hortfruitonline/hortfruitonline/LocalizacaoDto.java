package com.hortfruitonline.hortfruitonline;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

class IssPosition{
	private double latitude;
	private double longitude;
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
}
public class LocalizacaoDto{

	private IssPosition issPosition;
	private String message;
	private Long timestamp;
	
	@JsonProperty("geolocalizacao")
	public IssPosition getIssPosition() {
		return issPosition;
	}
	
	@JsonAlias(value = "iss_position")
	public void setIssPosition(IssPosition issPosition) {
		this.issPosition = issPosition;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	
}



