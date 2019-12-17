package com.tyss.asset.dao;

import com.tyss.asset.dto.AssetBean;

public interface AssetDAO {
	public boolean registerAsset(AssetBean bean);
	public AssetBean loginAsset(String email,String password);
}//end of EmployeeDAO
