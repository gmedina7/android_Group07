package com.area51.mytracking.entity;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

import com.google.android.gms.maps.model.LatLng;

public class ReportEntity implements Serializable {
	
	//@JsonProperty("Lat")
	private String lat;
	private String lng;
	private String path;
	private String deviceId;
	private String timeId;
	


	public String getTimeId() {
		return timeId;
	}
	public void setTimeId(String timeId) {
		this.timeId = timeId;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	private double lat1;
//	private LatLng location;
	
	/*public LatLng getLocation() {
		return location;
	}
	public void setLocation(LatLng location) {
		this.location = location;
	} */
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "lng "+this.lng+ " lat "+this.lat+ " path "+this.path + " device_id "+this.deviceId;
	}
	

}
