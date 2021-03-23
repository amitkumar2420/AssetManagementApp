package com.cg.ama.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Warehouse {
	
	@Id
	@Column(name="wh_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long whId;
	
	@Column(name="mgr_id")
	private long mgrId;
	
	@Embedded
	private Address address;
	
	@OneToMany(mappedBy="warehouse")
	private List<Asset> assets;
	

	public Warehouse() {
		super();
	}

	public Warehouse(long mgrId, Address address, List<Asset> assets) {
		super();
		this.mgrId = mgrId;
		this.address = address;
		this.assets = assets;
	}

	public long getWhId() {
		return whId;
	}

	public void setWhId(long whId) {
		this.whId = whId;
	}

	public long getMgrId() {
		return mgrId;
	}

	public void setMgrId(long mgrId) {
		this.mgrId = mgrId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Asset> getAssets() {
		return assets;
	}

	public void setAssets(List<Asset> assets) {
		this.assets = assets;
	} 
	
	
}
