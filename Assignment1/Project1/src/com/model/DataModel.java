package com.model;

import java.io.Serializable;
import java.sql.Blob;

public class DataModel implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String date_register;
	private String cname;
	private String cemail;
	private String caddress;
	private String cphone;
	private String ccity;
	private String ccountry;
	private String cedu;
	private Blob cphoto;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getDateRegister() {
		return date_register;
	}
	public void setDateRegister(String date_register) {
		this.date_register=date_register;
	}
	public String getName() {
		return cname;
	}
	public void setName(String cname) {
		this.cname=cname;
	}
	public String getEmail() {
		return cemail;
	}
	public void setEmail(String cemail) {
		this.cemail=cemail;
	}
	public String getAddress() {
		return caddress;
	}
	public void setAddress(String caddress) {
		this.caddress=caddress;
	}
	public String getPhone() {
		return cphone;
	}
	public void setPhone(String cphone) {
		this.cphone=cphone;
	}
	public String getCity() {
		return ccity;
	}
	public void setCity(String ccity) {
		this.ccity=ccity;
	}
	public String getCountry() {
		return ccountry;
	}
	public void setCountry(String ccountry) {
		this.ccountry=ccountry;
	}
	public String getEducation() {
		return cedu;
	}
	public void setEducation(String cedu) {
		this.cedu=cedu;
	}
	 
    public Blob getPhoto() {
        return cphoto;
    }
 
    public void setPhoto(Blob cphoto) {
        this.cphoto = cphoto;
    }
}
