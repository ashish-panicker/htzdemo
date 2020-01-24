package com.hetzner.demo.model;

public class HomeLocation {
	private String id;
	private String name;
	private String description;
	private String country;
	private String city;
	private String latitude;
	private String longitude;
	private String network_zone;
	
	public HomeLocation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HomeLocation(String id, String name, String description, String country, String city, String latitude,
			String longitude, String network_zone) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.country = country;
		this.city = city;
		this.latitude = latitude;
		this.longitude = longitude;
		this.network_zone = network_zone;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getNetwork_zone() {
		return network_zone;
	}
	public void setNetwork_zone(String network_zone) {
		this.network_zone = network_zone;
	}
}
