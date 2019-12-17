package com.tyss.asset.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.asset.dao.AssetProductDAO;
import com.tyss.asset.dto.AssetProductBean;

@Service
public class AssetProductServiceImpl implements AssetProductService {
	@Autowired
	private AssetProductDAO dao;

	@Override
	public boolean addAssetProduct(AssetProductBean bean) {
		return dao.addAssetProduct(bean);
	}

	@Override
	public boolean modifyAssetProduct(AssetProductBean bean) {
		return dao.modifyAssetProduct(bean);
	}

	@Override
	public boolean deleteAssetProduct(int pid) {
		return dao.deleteAssetProduct(pid);
	}

	@Override
	public AssetProductBean getAssetProduct(int pid) {
		return dao.getAssetProduct(pid);
	}

	@Override
	public List<AssetProductBean> getAllAssetProduct() {
		return dao.getAllAssetProduct();
	}

	

}
