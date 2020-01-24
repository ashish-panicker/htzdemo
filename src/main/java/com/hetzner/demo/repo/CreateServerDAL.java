package com.hetzner.demo.repo;

import java.util.List;

import com.hetzner.demo.model.CreateServer;
import com.hetzner.demo.model.ServerRequest;

public interface CreateServerDAL {
	
	public ServerRequest create(ServerRequest c);
	public List<CreateServer> getAllServer();
	public Boolean Delete(CreateServer c);
}
