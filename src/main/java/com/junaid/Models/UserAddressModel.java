package com.junaid.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "useraddress")
public class UserAddressModel {

	@Override
	public String toString() {
		return "UserAddressModel [Uid=" + Uid + ", AddressLine1=" + AddressLine1 + ", AddressLine2=" + AddressLine2
				+ ", locality=" + locality + ", city=" + city + ", pin=" + pin + ", district=" + district + ", country="
				+ country + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	long Uid;
	
	@Column
	String AddressLine1;
	
	@Column
	String AddressLine2;
	
	@Column
	String locality;
	
	@Column
	String city;
	
	@Column
	int pin;
	
	@Column
	String district;
	
	@Column
	String country;

	public long getUid() {
		return Uid;
	}

	public void setUid(long uid) {
		Uid = uid;
	}

	public String getAddressLine1() {
		return AddressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return AddressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public UserAddressModel(String addressLine1, String addressLine2, String locality, String city, int pin,
			String district, String country) {
		super();
		AddressLine1 = addressLine1;
		AddressLine2 = addressLine2;
		this.locality = locality;
		this.city = city;
		this.pin = pin;
		this.district = district;
		this.country = country;
	}

	public UserAddressModel() {
		super();
	}
	
	
	
}
