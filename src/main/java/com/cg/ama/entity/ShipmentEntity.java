package com.cg.ama.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shipments")
public class ShipmentEntity {
	
	@Id
	@Column(name="shipment_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long shipmentId;
	
	@Column(name="asset_id")
	private long assetId;
	
	@Column(name="user_id")
	private long userId;
	
	@Enumerated(EnumType.STRING)
	private ShipmentStatus status;
	
	@Column(name="source_wh_id")
	private long sourceWhId;
	
	@Column(name="dest_wh_id")
	private long destWhId;
	
	@Column(name="ship_date")
	private Date shipmentDate;
	
	@Column(name="delivery_date")
	private Date deliveryDate;

	
	public ShipmentEntity() {
		super();
	}

	public ShipmentEntity(long assetId, long userId, ShipmentStatus status, long sourceWhId, long destWhId, Date shipmentDate,
			Date deliveryDate) {
		super();
		this.assetId = assetId;
		this.userId = userId;
		this.status = status;
		this.sourceWhId = sourceWhId;
		this.destWhId = destWhId;
		this.shipmentDate = shipmentDate;
		this.deliveryDate = deliveryDate;
	}

	public long getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(long shipmentId) {
		this.shipmentId = shipmentId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public ShipmentStatus getStatus() {
		return status;
	}

	public void setStatus(ShipmentStatus status) {
		this.status = status;
	}

	public long getSourceWhId() {
		return sourceWhId;
	}

	public void setSourceWhId(long sourceWhId) {
		this.sourceWhId = sourceWhId;
	}

	public long getDestWhId() {
		return destWhId;
	}

	public void setDestWhId(long destWhId) {
		this.destWhId = destWhId;
	}

	public Date getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(Date shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public long getAssetId() {
		return assetId;
	}
	
	
}
