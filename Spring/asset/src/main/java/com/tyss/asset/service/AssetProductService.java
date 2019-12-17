package com.tyss.asset.service;

import java.util.List;

import com.tyss.asset.dto.AssetProductBean;

public interface AssetProductService {
	public boolean addAssetProduct(AssetProductBean bean);
	public boolean modifyAssetProduct(AssetProductBean bean);
	public boolean deleteAssetProduct(int pid);
	public AssetProductBean getAssetProduct(int id);
	public List<AssetProductBean> getAllAssetProduct();
}
