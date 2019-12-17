package com.tyss.asset.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.asset.dao.AssetDAO;
import com.tyss.asset.dto.AssetBean;

@Service
public class AssetServiceImpl implements AssetService{

	@Autowired
	private AssetDAO dao;

	@Override
	public boolean registerAsset(AssetBean bean) {
		if(bean.getName()==null||bean.getPassword()==null) {
			return false;
		}else if(bean.getPassword().length()<8) {
			return false;
		}
		return dao.registerAsset(bean);
	}

	@Override
	public AssetBean loginAsset(String email, String password) {
		return dao.loginAsset(email, password);
	}

}
