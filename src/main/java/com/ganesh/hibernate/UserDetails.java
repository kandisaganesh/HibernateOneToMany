package com.ganesh.hibernate;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {
	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private int userId;
	@Column(name = "USER_NAME")
	private String userName;

	@OneToMany
	@JoinTable(name = "USERDETAILS_VEHICLE_REF", joinColumns = @JoinColumn(name = "USERDETAILS_ID"), inverseJoinColumns = @JoinColumn(name = "VEHICLE_ID"))
	private Collection<Vehicle> vehiclesList = new ArrayList<Vehicle>();

	public Collection<Vehicle> getVehiclesList() {
		return vehiclesList;
	}

	public void setVehiclesList(Collection<Vehicle> vehiclesList) {
		this.vehiclesList = vehiclesList;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
