package com.tyss.asset.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.tyss.asset.dto.AssetProductBean;
import com.tyss.asset.dto.AssetProductResponse;
import com.tyss.asset.service.AssetProductService;

@CrossOrigin(origins = "*",allowCredentials = "true")
@RestController
public class AssetProductController {
	@Autowired
	private AssetProductService service;
	
	@PostMapping(path="/add", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetProductResponse addAssetProduct(@RequestBody AssetProductBean bean) {
		AssetProductResponse response = new AssetProductResponse();
		if(service.addAssetProduct(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Added to the DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not Added to the DB");
		}
		return response;
	}//end of addAsset
	
	@PutMapping(path="/modify", consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetProductResponse modifyAssetProduct(@RequestBody AssetProductBean bean) {
		AssetProductResponse response = new AssetProductResponse();
		if(service.modifyAssetProduct(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Modify in the DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not Modify in the DB");
		}
		return response;
	} //end of modifyAsset
	
	@DeleteMapping(path="/deleteProduct/{pid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetProductResponse deleteAssetProduct(@PathVariable("pid")int pid) {
		AssetProductResponse response = new AssetProductResponse();
		if(service.deleteAssetProduct(pid)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Deleted from  the DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not Deleted from the DB");
		}
		return response;
	}//end of deleteAsset
	
	@GetMapping(path="/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetProductResponse getAssetProduct(@RequestParam("pid")int pid) {
		AssetProductResponse response = new AssetProductResponse();
		AssetProductBean bean = service.getAssetProduct(pid);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found in the DB");
			response.setBean(bean);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found  in the DB");
		}
		return response;
	}//end of getAsset
	
	@GetMapping(path="/get-all", produces = MediaType.APPLICATION_JSON_VALUE)
	public AssetProductResponse getAllAssetProduct() {
		AssetProductResponse response = new AssetProductResponse();
		List<AssetProductBean> beans = service.getAllAssetProduct();
		if(!beans.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found in the DB");
			response.setAssetProductBeans(beans);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found  in the DB");
		}
		return response;
	}//end of getAllAsset
}
