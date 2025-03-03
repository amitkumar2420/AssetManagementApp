package com.cg.ama.model;

import java.time.LocalDate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;


public class ShipmentModel {
	
	private Long shipmentId;
	
	@NotNull(message="Asset ID cannot be null")	
	private Long assetId;
	
	@NotNull(message="User ID cannot be null")	
	private Long userId;
	
	@NotNull(message="Status cannot be null")	
	@NotBlank(message="Status cannot be blank")
	private String status;
	
	@NotNull(message="Source Warehouse ID cannot be null")	
	private Long sourceWhId;
	
	@NotNull(message="Destination Warehouse ID cannot be null")	
	private Long destWhId;
	
	@PastOrPresent(message="Enter a valid date")
	@NotNull(message="Shipment Date cannot be null")	
	private LocalDate shipmentDate;
	
	private LocalDate deliveryDate;
	
	public ShipmentModel() {
		super();
	}

	
	public ShipmentModel(long shipmentId, long assetId, long userId, String status, 
			long sourceWhId,long destWhId, LocalDate shipmentDate, LocalDate deliveryDate) {
		super();
		this.shipmentId = shipmentId;
		this.assetId = assetId;
		this.userId = userId;
		this.status = status;
		this.sourceWhId = sourceWhId;
		this.destWhId = destWhId;
		this.shipmentDate = shipmentDate;
		this.deliveryDate = deliveryDate;
	}


	public ShipmentModel(
			long assetId, long userId, String status, long sourceWhId,long destWhId, 
			LocalDate shipmentDate, LocalDate deliveryDate) {
		super();
		this.assetId = assetId;
		this.userId = userId;
		this.status = status;
		this.sourceWhId = sourceWhId;
		this.destWhId = destWhId;
		this.shipmentDate = shipmentDate;
		this.deliveryDate = deliveryDate;
	}

	public Long getAssetId() {
		return assetId;
	}

	public void setAssetId(long assetId) {
		this.assetId = assetId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getSourceWhId() {
		return sourceWhId;
	}

	public void setSourceWhId(long sourceWhId) {
		this.sourceWhId = sourceWhId;
	}

	public Long getDestWhId() {
		return destWhId;
	}

	public void setDestWhId(long destWhId) {
		this.destWhId = destWhId;
	}

	public LocalDate getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(LocalDate shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Long getShipmentId() {
		return shipmentId;
	}

 


	
	

}
