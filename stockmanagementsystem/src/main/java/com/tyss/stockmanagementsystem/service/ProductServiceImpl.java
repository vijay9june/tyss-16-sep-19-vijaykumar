package com.tyss.stockmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.stockmanagementsystem.dao.ProductDAO;
import com.tyss.stockmanagementsystem.dto.ProductBean;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO dao;

	@Override
	public boolean addProduct(ProductBean bean) {
		return dao.addProduct(bean);
	}

	@Override
	public boolean modifyProduct(ProductBean bean) {
		return dao.modifyProduct(bean);
	}

	@Override
	public ProductBean searchProduct(int id) {
		return dao.searchProduct(id);
	}
	
	@Override
	public List<ProductBean> getAllProduct() {
		return dao.getAllProduct();
	}

}
