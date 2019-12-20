package com.tyss.stockmanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import com.tyss.stockmanagementsystem.dto.ProductBean;

@Repository
public class ProductDAOImpl implements ProductDAO {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addProduct(ProductBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			System.out.println(bean);
			transaction.commit();
			System.out.println(bean.getId());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}
	@Override
	public boolean modifyProduct(ProductBean apb) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		ProductBean productBean = manager.find(ProductBean.class, apb.getId());
		productBean.setName(apb.getName());
		productBean.setPrice(apb.getPrice());
		productBean.setQuantity(apb.getQuantity());
		productBean.setCategory(apb.getCategory());
		productBean.setCompany(apb.getCompany());
		manager.persist(productBean);
		transaction.commit();
		return true;
	}

	@Override
	public ProductBean searchProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		ProductBean bean = manager.find(ProductBean.class, id);
		return bean;
	}
	
	@Override
	public List<ProductBean> getAllProduct() {
		String jpql = "from ProductBean";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<ProductBean> query = manager.createQuery(jpql, ProductBean.class);
		List<ProductBean> productBeans = query.getResultList();
		return productBeans;
	}

}
