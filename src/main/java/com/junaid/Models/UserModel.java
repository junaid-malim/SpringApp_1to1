package com.junaid.Models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserModel {

	@Id
	@Column(name = "Uid",unique = true)
	@GeneratedValue(strategy = GenerationType.TABLE)
	long Uid;
	
	@Column
	String name;
	
	@OneToOne(cascade = CascadeType.ALL) @MapsId
	UserAddressModel Address;

	public UserModel() {
		super();
	}

	public UserModel(String name, UserAddressModel userAddressModel) {
		super();
		this.name = name;
		this.Address = userAddressModel;
	}

	public UserAddressModel getUserAddressModel() {
		return Address;
	}

	public void setUserAddressModel(UserAddressModel userAddressModel) {
		this.Address = userAddressModel;
	}

	public long getUid() {
		return Uid;
	}

	public void setUid(long uid) {
		Uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
