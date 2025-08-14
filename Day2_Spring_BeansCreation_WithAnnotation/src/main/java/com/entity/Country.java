package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton") @Scope("prototype") 
public class Country {
	@Value("+91")
	private String cid;
	@Value("India")
	private String country_name;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	@Override
	public String toString() {
		return "Country [cid=" + cid + ", country_name=" + country_name + "]";
	}
	public Country(String cid, String country_name) {
		super();
		this.cid = cid;
		this.country_name = country_name;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
