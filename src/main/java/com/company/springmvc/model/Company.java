package com.company.springmvc.model;

import java.util.List;

public class Company {
	private long id;	
	private String name;
	private String address;
	private String city;
	private String country;
	private String email;
	private String phonenumber;
	//private List<String> owners;
	private String owners;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Company(long id, String name, String address, String city,
			String country, String email, String phonenumber, String owners) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.country = country;
		this.email = email;
		this.phonenumber = phonenumber;
		this.owners = owners;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public String getOwners() {
		return owners;
	}
	public void setOwners(String owners) {
		this.owners = owners;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	

}
