package com.hetzner.demo.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class FloatingIp {
	/*private String id;
	private String ip;*/
	private String type;
	private String server;
	/*@DBRef
	private List<Dnsptr> dnsptr;*/
	private String homeLocation;
	private String description;
	private String name;
	/*private boolean blocked;
	@DBRef
	private Protection protection;
	@DBRef
	private Labels labels;
	@CreatedDate
	private Date createdDate= new Date();*/
	public FloatingIp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FloatingIp(String type, String server, String homeLocation, String description, String name) {
		super();
		this.type = type;
		this.server = server;
		this.homeLocation = homeLocation;
		this.description = description;
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public String getHomeLocation() {
		return homeLocation;
	}
	public void setHomeLocation(String homeLocation) {
		this.homeLocation = homeLocation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
