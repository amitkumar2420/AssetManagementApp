package com.cg.ama.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Asset {
	
	@Id
	@Column(name="asset_id", unique=true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long assetId;

	@ManyToOne
	@JoinColumn(name="wh_id")
	private Warehouse warehouse;
	
	private String model;
	
	@Enumerated(EnumType.STRING)
	private AssetType type;
	
	private String manufacturer;

	
	public Asset() {
		super();
	}

	public Asset(Warehouse warehouse, String model, AssetType type, String manufacturer) {
		super();
		this.warehouse = warehouse;
		this.model = model;
		this.type = type;
		this.manufacturer = manufacturer;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public AssetType getType() {
		return type;
	}

	public void setType(AssetType type) {
		this.type = type;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Long getAssetId() {
		return assetId;
	}
	
	
}
