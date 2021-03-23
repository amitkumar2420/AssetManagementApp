package com.cg.ama.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="warehouses")
public class WarehouseEntity {
	
	@Id
	@Column(name="wh_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long whId;
	
	@Column(name="mgr_id")
	private long mgrId;
	
	@Embedded
	private AddressEntity address;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="warehouse")
	private List<AssetEntity> assets;
	

	public WarehouseEntity() {
		super();
	}

	public WarehouseEntity(long mgrId, AddressEntity address, List<AssetEntity> assets) {
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

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

	public List<AssetEntity> getAssets() {
		return assets;
	}

	public void setAssets(List<AssetEntity> assets) {
		this.assets = assets;
	} 
	
	
}
