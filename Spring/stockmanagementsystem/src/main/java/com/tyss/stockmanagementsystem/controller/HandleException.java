package com.tyss.stockmanagementsystem.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tyss.stockmanagementsystem.dto.ProductResponse;

@RestControllerAdvice
public class HandleException {

	@ExceptionHandler(Exception.class)
	public ProductResponse getException() {
		ProductResponse response = new ProductResponse();
		response.setStatusCode(501);
		response.setMessage("Error in Code");
		response.setDescription("Got an Exception");
	
		response.getProductBeans();
		return response;
	}
}
