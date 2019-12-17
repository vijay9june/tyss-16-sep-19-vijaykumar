package com.tyss.asset.dto;

import java.util.List;

public class AssetProductResponse {
	private int statusCode;
	private String message;
	private String description;
	private AssetProductBean bean;
	private List<AssetProductBean> assetProductBeans;
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public AssetProductBean getBean() {
		return bean;
	}
	public void setBean(AssetProductBean bean) {
		this.bean = bean;
	}
	public List<AssetProductBean> getAssetProductBeans() {
		return assetProductBeans;
	}
	public void setAssetProductBeans(List<AssetProductBean> assetProductBeans) {
		this.assetProductBeans = assetProductBeans;
	}
	
}
