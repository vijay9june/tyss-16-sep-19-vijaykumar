package com.tyss.asset.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.asset.dto.AssetBean;

@Repository
public class AssetDAOImpl implements AssetDAO {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean registerAsset(AssetBean bean) {
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
	public AssetBean loginAsset(String email, String password) {
		String jpql = "from AssetBean where email=:email and password=:password";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<AssetBean> query = manager.createQuery(jpql, AssetBean.class);

		query.setParameter("email", email);
		query.setParameter("password", password);
		try {
			AssetBean bean = query.getSingleResult();
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
