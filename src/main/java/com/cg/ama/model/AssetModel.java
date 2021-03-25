package com.cg.ama.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AssetModel {

	private Long assetId;
	
	@NotNull(message="Warehouse ID cannot be null")	
	private WarehouseModel warehouse;
	
	@NotNull(message="Asset ID cannot be null")	
	@NotBlank(message="Asset ID cannot be blank")
	private String model;
	
	@NotNull(message="Asset ID cannot be null")	
	@NotBlank(message="Asset ID cannot be blank")
	private String type;
	
	@NotNull(message="Asset ID cannot be null")	
	@NotBlank(message="Asset ID cannot be blank")
	private String manufacturer;

	public AssetModel() {
		super();
	}
	
	public AssetModel(Long assetId, WarehouseModel warehouse, String model, String type, String manufacturer) {
		super();
		this.assetId = assetId;
		this.warehouse = warehouse;
		this.model = model;
		this.type = type;
		this.manufacturer = manufacturer;
	}


	public AssetModel(WarehouseModel warehouse, String model, String type, String manufacturer) {
		super();
		this.warehouse = warehouse;
		this.model = model;
		this.type = type;
		this.manufacturer = manufacturer;
	}



	public WarehouseModel getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(WarehouseModel warehouse) {
		this.warehouse = warehouse;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
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
