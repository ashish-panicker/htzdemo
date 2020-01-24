package com.hetzner.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hetzner.demo.model.CreateServer;
import com.hetzner.demo.model.ServerRequest;
import com.hetzner.demo.repo.CreateServerDAL;

@RestController
public class ServerController {

	@Autowired
	private CreateServerDAL createserverDal;

	@PostMapping("/servers")
	public ServerRequest create(@RequestBody ServerRequest c) {
		return createserverDal.create(c);
	}
}
