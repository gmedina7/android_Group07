package com.example.preporterociudadano.entity;

import java.io.Serializable;

public class SuccessEntity implements Serializable{

	String createdAt;
	String objectId;
	
	
	public SuccessEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	
	
}
