package com.tyss.asset.dto;

import java.util.List;

public class AssetResponse {
	private int statusCode;
	private String message;
	private String description;
	private String role;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	private List<AssetBean > assetBeans;

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
	
	public List<AssetBean> getAssetBeans() {
		return assetBeans;
	}
	public void setAssetBeans(List<AssetBean> assetBeans) {
		this.assetBeans = assetBeans;
	}
		
}
