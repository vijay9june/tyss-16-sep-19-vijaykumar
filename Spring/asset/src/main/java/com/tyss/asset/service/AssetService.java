package com.tyss.asset.service;

import com.tyss.asset.dto.AssetBean;

public interface AssetService {
	public boolean registerAsset(AssetBean bean);
	public AssetBean loginAsset(String email,String password);
}
