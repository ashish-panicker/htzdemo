package com.hetzner.demo.model;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class CreateServer {
	private String id;
	private String core;
	private String ram;
	private String name;
	@DBRef
	private Volume volume;
	@DBRef
	private FloatingIp floatingip;

	public CreateServer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateServer(String id, String core, String ram, String name, Volume volume, FloatingIp floatingip) {
		super();
		this.id = id;
		this.core = core;
		this.ram = ram;
		this.name = name;
		this.volume = volume;
		this.floatingip = floatingip;
	}

	public String getCore() {
		return core;
	}

	public void setCore(String core) {
		this.core = core;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "CreateServer [id=" + id + ", core=" + core + ", ram=" + ram + ", name=" + name + ", volume=" + volume
				+ ", floatingip=" + floatingip + "]";
	}

}
