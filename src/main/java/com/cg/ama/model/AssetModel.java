package com.cg.ama.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.cg.ama.entity.AssetType;
import com.cg.ama.entity.WarehouseEntity;

public class AssetModel {

	private Long assetId;
	
	@NotNull(message="Warehouse ID cannot be null")	
	@NotBlank(message="Warehouse ID cannot be blank")
	private WarehouseEntity warehouse;
	
	@NotNull(message="Asset ID cannot be null")	
	@NotBlank(message="Asset ID cannot be blank")
	private String model;
	
	@NotNull(message="Asset ID cannot be null")	
	@NotBlank(message="Asset ID cannot be blank")
	private AssetType type;
	
	@NotNull(message="Asset ID cannot be null")	
	@NotBlank(message="Asset ID cannot be blank")
	private String manufacturer;

	public AssetModel() {
		super();
	}

	public AssetModel(Long assetId,
			@NotNull(message = "Warehouse ID cannot be null") @NotBlank(message = "Warehouse ID cannot be blank") WarehouseEntity warehouse,
			@NotNull(message = "Asset ID cannot be null") @NotBlank(message = "Asset ID cannot be blank") String model,
			@NotNull(message = "Asset ID cannot be null") @NotBlank(message = "Asset ID cannot be blank") AssetType type,
			@NotNull(message = "Asset ID cannot be null") @NotBlank(message = "Asset ID cannot be blank") String manufacturer) {
		super();
		this.assetId = assetId;
		this.warehouse = warehouse;
		this.model = model;
		this.type = type;
		this.manufacturer = manufacturer;
	}

	public AssetModel(
			@NotNull(message = "Warehouse ID cannot be null") @NotBlank(message = "Warehouse ID cannot be blank") WarehouseEntity warehouse,
			@NotNull(message = "Asset ID cannot be null") @NotBlank(message = "Asset ID cannot be blank") String model,
			@NotNull(message = "Asset ID cannot be null") @NotBlank(message = "Asset ID cannot be blank") AssetType type,
			@NotNull(message = "Asset ID cannot be null") @NotBlank(message = "Asset ID cannot be blank") String manufacturer) {
		super();
		this.warehouse = warehouse;
		this.model = model;
		this.type = type;
		this.manufacturer = manufacturer;
	}

	public WarehouseEntity getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(WarehouseEntity warehouse) {
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
