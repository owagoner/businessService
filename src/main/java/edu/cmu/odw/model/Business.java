package edu.cmu.odw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Business {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String url;
	private String phoneNumber;
	private Long businessTypeId;

	public Business() {
	}

	public Business(String name, String url, String phoneNumber, long businessTypeId) {
		super();
		this.name = name;
		this.url = url;
		this.phoneNumber = phoneNumber;
		this.businessTypeId = businessTypeId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getbusinessTypeId() {
		return businessTypeId;
	}

	public void setbusinessTypeId(Long businessTypeId) {
		this.businessTypeId = businessTypeId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Business[id=" + this.id + ", name=" + this.name + ", url=" + this.url + ", phonenumber="
				+ this.phoneNumber + "]";
	}
}
