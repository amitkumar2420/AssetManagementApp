package com.cg.ama.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class WarehouseModel {
	
	private long whId;
	
	@NotEmpty(message="Warehouse manager ID cannot be empty")
    @NotNull(message="Warehouse manager ID  cannot be omitted")
	private long mgrId;
	
	@NotEmpty(message="address cannot be empty")
    @NotNull(message="address  cannot be omitted")
	private AddressModel address;

	
	public WarehouseModel() {
		super();
	}

	public WarehouseModel(long whId,
			@NotEmpty(message = "Warehouse manager ID cannot be empty") @NotNull(message = "Warehouse manager ID  cannot be omitted") long mgrId,
			@NotEmpty(message = "address cannot be empty") @NotNull(message = "address  cannot be omitted") AddressModel address) {
		super();
		this.whId = whId;
		this.mgrId = mgrId;
		this.address = address;
	}

	public WarehouseModel(
			@NotEmpty(message = "Warehouse manager ID cannot be empty") @NotNull(message = "Warehouse manager ID  cannot be omitted") long mgrId,
			@NotEmpty(message = "address cannot be empty") @NotNull(message = "address  cannot be omitted") AddressModel address) {
		super();
		this.mgrId = mgrId;
		this.address = address;
	}

	public long getMgrId() {
		return mgrId;
	}

	public void setMgrId(long mgrId) {
		this.mgrId = mgrId;
	}

	public AddressModel getAddress() {
		return address;
	}

	public void setAddress(AddressModel address) {
		this.address = address;
	}

	public long getWhId() {
		return whId;
	}
	
	
}
