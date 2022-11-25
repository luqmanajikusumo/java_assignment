package com.model;

import java.io.Serializable;
import java.sql.Blob;

public class Model2 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String email;
	private String uname;
	private String password;
	private String address;
	private String phone;
	private String city;
	private String country;
	private Blob image;
	private String[] elec;
	private String[] food;
	private String[] edu;
	private String[] med;
	private String price;
	private String name;
	private String firstname;
	private String lastname;
	private String[] price2;
	private String OrderDateTime;
	public String getOrderDateTime() {
		return OrderDateTime;
	}
	public void setOrderDateTime(String OrderDateTime) {
		this.OrderDateTime=OrderDateTime;
	}	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname=uname;
	}
	public String getPass() {
		return password;
	}
	public void setPass(String password) {
		this.password=password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country=country;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price=price;
	}
	public String[] getPrice2() {
		return price2;
	}
	public void setPrice2(String[] price2) {
		this.price2=price2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String firstname) {
		this.firstname=firstname;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String lastname) {
		this.lastname=lastname;
	}
	public String[] getElec() {
		return elec;
	}
	public void setElec(String[] elec) {
		this.elec=elec;
	}
	public String[] getFood() {
		return food;
	}
	public void setFood(String[] food) {
		this.food=food;
	}
	public String[] getEdu() {
		return edu;
	}
	public void setEdu(String[] edu) {
		this.edu=edu;
	}
	public String[] getMed() {
		return med;
	}
	public void setMed(String[] med) {
		this.med=med;
	}
    public Blob getImage() {
        return image;
    }
    public void setImage(Blob image) {
        this.image = image;
    }
}
