package com.cg.ama.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Shipment {
	
	@Id
	@Column(name="shipment_id")
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
	
	@Column(name="deivery_id")
	private Date deliveryDate;
}
