package com.model;

import java.io.Serializable;
import java.sql.Blob;

public class DataModel implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String email;
	private String uname;
	private String password;
	private String address;
	private String phone;
	private String city;
	private String country;
	private String comment;
	private Blob photo;
	private Blob file;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
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
    public Blob getPhoto() {
        return photo;
    }
    public void setPhoto(Blob photo) {
        this.photo = photo;
    }
    public Blob getFile() {
        return file;
    }
    public void setFile(Blob file) {
        this.file = file;
    }
    public String getComment() {
    	return comment;
    }
    public void setComment(String comment) {
		this.comment=comment;
	}
}
