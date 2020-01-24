package com.hetzner.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hetzner.demo.model.FloatingIp;
import com.hetzner.demo.repo.FloatingIpDAL;

@RestController
public class FloatingIpController {
	@Autowired
	private FloatingIpDAL floatingipDal;
	
//	@PostMapping("https://api.hetzner.cloud/v1/floating_ips")
	public FloatingIp create(FloatingIp f){
		return floatingipDal.create(f);
	}
}
