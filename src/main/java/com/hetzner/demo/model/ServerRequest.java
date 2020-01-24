package com.hetzner.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ServerRequest {

	private String name; // The only attribute that should be set when changing a server's name

	@JsonProperty("server_type")
	private String serverType;
	private String datacenter;
	private String location;

	@JsonProperty("start_after_create")
	private boolean startAfterCreate;
	private String image;

	@JsonProperty("ssh_keys")
	private List<String> sshKeys;

	@JsonProperty("user_data")
	private String userData;

	@Override
	public String toString() {
		return "ServerRequest [name=" + name + ", serverType=" + serverType + ", datacenter=" + datacenter
				+ ", location=" + location + ", startAfterCreate=" + startAfterCreate + ", image=" + image
				+ ", sshKeys=" + sshKeys + ", userData=" + userData + "]";
	}
	
	

}
