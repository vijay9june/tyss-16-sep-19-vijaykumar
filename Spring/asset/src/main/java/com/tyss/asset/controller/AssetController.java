package com.tyss.asset.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.asset.dto.AssetBean;
import com.tyss.asset.dto.AssetResponse;
import com.tyss.asset.service.AssetService;
@CrossOrigin(origins = "*",allowCredentials = "true")
@RestController
public class AssetController {
	
	@Autowired
	private AssetService service;
	
	@PostMapping(path="/register", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetResponse registerAsset(@RequestBody AssetBean bean) {
		AssetResponse response = new AssetResponse();
		if(service.registerAsset(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Added to the DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not Added to the DB");
		}
		return response;
	}//end of registerAsset
	
	@PostMapping(path="/login", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetResponse loginAsset(@RequestBody AssetBean bean1 ) {
		
		AssetResponse response = new AssetResponse();
		AssetBean bean = service.loginAsset(bean1.getEmail(),bean1.getPassword());
		if(bean!=null) {
			String role = bean.getRole();
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("login successful");
			response.setRole(role);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Invalid Email");
		}
		return response;
	}
}






