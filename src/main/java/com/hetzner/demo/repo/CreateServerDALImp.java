package com.hetzner.demo.repo;

import java.util.Collections;
import java.util.List;
import java.lang.String;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.hetzner.demo.model.CreateServer;
import com.hetzner.demo.model.ServerRequest;

@Repository
@PropertySource("classpath:global.properties")
public class CreateServerDALImp implements CreateServerDAL{
	
	private RestTemplate resttemplate;
	private String token;
	private HttpHeaders httpHeaders;
	private static String url = "https://api.hetzner.cloud/v1";
			
	public CreateServerDALImp(@Value("${api.token}") String token) {
		
        this.token = token;

        this.httpHeaders = new HttpHeaders();
        this.httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        this.httpHeaders.add("Authorization", "Bearer " + token);
        new HttpEntity<>("parameters", httpHeaders);

        resttemplate = new RestTemplate();
    }
	@Override
	public ServerRequest create(@RequestBody ServerRequest c) {
		// TODO Auto-generated method stub
		System.out.println("inside CreateServerDal -> create");
		System.out.println(c);
		return resttemplate.postForEntity(url+"/servers",new HttpEntity<>(c, httpHeaders), ServerRequest.class).getBody();
	}
	@Override
	public List<CreateServer> getAllServer() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean Delete(CreateServer c) {
		// TODO Auto-generated method stub
		return null;
	}


}
