package com.tyss.stockmanagementsystem.dao;

import java.util.List;
import com.tyss.stockmanagementsystem.dto.ProductBean;

public interface ProductDAO {
	public boolean addProduct(ProductBean bean);
	public boolean modifyProduct(ProductBean bean);
	public ProductBean searchProduct(int id);
	public List<ProductBean> getAllProduct();
}
