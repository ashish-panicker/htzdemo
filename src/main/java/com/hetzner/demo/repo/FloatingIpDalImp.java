package com.hetzner.demo.repo;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.hetzner.demo.model.FloatingIp;

@Repository
public class FloatingIpDalImp implements FloatingIpDAL{
	
	private MongoTemplate mongo;

	@Override
	public FloatingIp create(FloatingIp floatip) {
		// TODO Auto-generated method stub
		return mongo.save(floatip);
	}
	
}
