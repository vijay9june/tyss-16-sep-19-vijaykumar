package com.tyss.stockmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.stockmanagementsystem.dto.ProductBean;
import com.tyss.stockmanagementsystem.dto.ProductResponse;
import com.tyss.stockmanagementsystem.service.ProductService;

@CrossOrigin(origins = "*",allowCredentials = "true")
@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	
	@PostMapping(path="/add", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse addProduct(@RequestBody ProductBean bean) {
		ProductResponse response = new ProductResponse();
		if(service.addProduct(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Added to the DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not Added to the DB");
		}
		return response;
	}//end of addProduct
	
	@PutMapping(path="/modify", consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse modifyProduct(@RequestBody ProductBean bean) {
		ProductResponse response = new ProductResponse();
		if(service.modifyProduct(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Modify in the DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not Modify in the DB");
		}
		return response;
	} //end of modifyProduct
	
	@GetMapping(path="/search", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse searchProduct(@RequestParam("id")int id) {
		ProductResponse response = new ProductResponse();
		ProductBean bean = service.searchProduct(id);
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
	}//end of searchProduct
	
	@GetMapping(path="/get-all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getAllProduct() {
		ProductResponse response = new ProductResponse();
		List<ProductBean> beans = service.getAllProduct();
		if(!beans.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found in the DB");
			response.setProductBeans(beans);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found  in the DB");
		}
		return response;
	}//end of getAllAsset
	
}
