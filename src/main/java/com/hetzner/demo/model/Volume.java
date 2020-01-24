package com.hetzner.demo.model;

public class Volume {
	private String size;
	private String name;
	private String location;
	private boolean automount;
	private String format;
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isAutomount() {
		return automount;
	}
	public void setAutomount(boolean automount) {
		this.automount = automount;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	
	
}
