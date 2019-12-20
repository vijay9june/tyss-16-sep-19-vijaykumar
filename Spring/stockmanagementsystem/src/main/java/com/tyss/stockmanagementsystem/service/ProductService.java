package com.tyss.stockmanagementsystem.service;

import java.util.List;

import com.tyss.stockmanagementsystem.dto.ProductBean;

public interface ProductService {
	public boolean addProduct(ProductBean bean);
	public boolean modifyProduct(ProductBean bean);
	public ProductBean searchProduct(int id);
	public List<ProductBean> getAllProduct();
}