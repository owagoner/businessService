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
	private String description;
	private String twitterHandle;
	private String businessHours;

	public Business() {
	}

	public Business(String name, String businessHours, String url, String phoneNumber, long businessTypeId, String description, String twitterHandle) {
		super();
		this.name = name;
		this.url = url;
		this.phoneNumber = phoneNumber;
		this.businessTypeId = businessTypeId;
		this.description = description;
		this.twitterHandle = twitterHandle;
		this.setBusinessHours(businessHours);
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTwitterHandle() {
		return twitterHandle;
	}

	public void setTwitterHandle(String twitterHandle) {
		this.twitterHandle = twitterHandle;
	}

	public String getBusinessHours() {
		return businessHours;
	}

	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}
}
