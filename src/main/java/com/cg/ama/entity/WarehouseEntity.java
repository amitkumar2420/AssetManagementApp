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
	
	
	public WarehouseEntity(long whId, long mgrId, AddressEntity address) {
		super();
		this.whId = whId;
		this.mgrId = mgrId;
		this.address = address;
	}


	public WarehouseEntity(long mgrId, AddressEntity address) {
		super();
		this.mgrId = mgrId;
		this.address = address;
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


	@Override
	public String toString() {
		return "WarehouseEntity [whId=" + whId + ", mgrId=" + mgrId + ", address=" + address + ", assets=" + assets
				+ "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((assets == null) ? 0 : assets.hashCode());
		result = prime * result + (int) (mgrId ^ (mgrId >>> 32));
		result = prime * result + (int) (whId ^ (whId >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WarehouseEntity other = (WarehouseEntity) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (assets == null) {
			if (other.assets != null)
				return false;
		} else if (!assets.equals(other.assets))
			return false;
		if (mgrId != other.mgrId)
			return false;
		if (whId != other.whId)
			return false;
		return true;
	} 
	
	
	
}
