package com.tyss.stockmanagementsystem.dto;

import java.util.List;

import lombok.Data;

@Data
public class ProductResponse {
	private int statusCode;
	private String message;
	private String description;
	private ProductBean bean;
	private List<ProductBean> productBeans;
	
}
